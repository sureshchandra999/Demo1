package com.Suresh5.geektrust.GeekRacersBookingSystem;
// GeekRacersBookingSystem.java
import java.io.*;
import java.util.*;

public class GeekRacersBookingSystem {
    private Map<VehicleType, List<Track>> tracks = new HashMap<>();
    private BufferedWriter auditWriter;
    private int startHour, endHour;
    private Map<String, Booking> allBookings = new HashMap<>();

    public GeekRacersBookingSystem(int startHour, int endHour, String auditFile) throws IOException {
        this.startHour = startHour;
        this.endHour = endHour;
        auditWriter = new BufferedWriter(new FileWriter(auditFile));
        initTracks();
    }

    private void initTracks() {
        tracks.put(VehicleType.BIKE, List.of(new Track(TrackType.REGULAR, VehicleType.BIKE, 4, 60)));
        tracks.put(VehicleType.CAR, List.of(
            new Track(TrackType.REGULAR, VehicleType.CAR, 2, 120),
            new Track(TrackType.VIP, VehicleType.CAR, 1, 250)
        ));
        tracks.put(VehicleType.SUV, List.of(
            new Track(TrackType.REGULAR, VehicleType.SUV, 2, 200),
            new Track(TrackType.VIP, VehicleType.SUV, 1, 300)
        ));
    }

    public void processCommand(String line, String outputFile) throws IOException {
        String[] parts = line.trim().split(" ");
        if (parts[0].equals("BOOK")) {
            VehicleType type = VehicleType.valueOf(parts[1]);
            int start = Integer.parseInt(parts[2]);
            int amount = Integer.parseInt(parts[3]);
            String vehicleId = "V" + UUID.randomUUID().toString().substring(0, 8);
            String bookingId = bookTrack(type, start, amount, vehicleId);
            if (bookingId == null) auditWriter.write("REJECTED: " + line + "");
        } else if (parts[0].equals("RELEASE")) {
            boolean ok = releaseTrack(parts[1]);
            if (!ok) auditWriter.write("REJECTED RELEASE: " + parts[1] + "");
        } else if (parts[0].equals("STATUS")) {
            writeStatus(outputFile);
        }
    }

    public String bookTrack(VehicleType type, int startHour, int amount, String vehicleId) {
        if (startHour < this.startHour || startHour > endHour - 3) return null;
        int minHours = 3, extraMinutes = (amount - 60 * minHours);
        int extraHours = extraMinutes > 15 ? (int) Math.ceil(extraMinutes / 60.0) : 0;

        for (Track t : tracks.get(type)) {
            if (t.isAvailable(startHour, minHours + extraHours)) {
                Booking b = t.book(type, startHour, minHours, extraHours, vehicleId);
                if (b != null) {
                    allBookings.put(b.getBookingId(), b);
                    return b.getBookingId();
                }
            }
        }
        return null;
    }

    public boolean releaseTrack(String bookingId) {
        for (List<Track> ts : tracks.values()) {
            for (Track t : ts) {
                if (t.release(bookingId)) {
                    allBookings.remove(bookingId);
                    return true;
                }
            }
        }
        return false;
    }

    public void writeStatus(String outFile) throws IOException {
        int regRev = 0, vipRev = 0;
        StringBuilder sb = new StringBuilder();
        sb.append("BOOKING DETAILS: ");
        for (Booking b : allBookings.values()) {
            sb.append(b).append("");
            if (b.toString().contains("VIP")) vipRev += b.getTotalCost();
            else regRev += b.getTotalCost();
        }
        sb.insert(0, "REGULAR : " + regRev + "VIP : " + vipRev + "");
        BufferedWriter writer = new BufferedWriter(new FileWriter(outFile));
        writer.write(sb.toString());
        writer.close();
    }

    public void closeAudit() throws IOException {
        auditWriter.close();
    }
}
