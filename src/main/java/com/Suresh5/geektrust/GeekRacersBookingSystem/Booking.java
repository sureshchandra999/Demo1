package com.Suresh5.geektrust.GeekRacersBookingSystem;

// Booking.java
public class Booking {
    private static int counter = 1000;
    private String bookingId;
    private VehicleType vehicleType;
    private TrackType trackType;
    private int startHour;
    private int durationHours;
    private int extraHours;
    private int costPerHour;
    private String vehicleId;

    public Booking(VehicleType vType, TrackType tType, int start, int duration, int extra, int cost, String vId) {
        this.vehicleType = vType;
        this.trackType = tType;
        this.startHour = start;
        this.durationHours = duration;
        this.extraHours = extra;
        this.costPerHour = cost;
        this.vehicleId = vId;
        this.bookingId = "BK" + counter++;
    }

    public String getBookingId() {
        return bookingId;
    }
    public boolean conflicts(int hour, int duration) {
        int end = startHour + durationHours + extraHours;
        return hour < end && hour + duration > startHour;
    }

    public int getTotalCost() {

        return durationHours * costPerHour + extraHours * 50;
    }

    @Override
    public String toString() {
        return bookingId + " | " + vehicleType + " | " + trackType + " | Start: " + startHour + ":00 | Duration: " + durationHours + "h | Extra: " + extraHours + "h | Total: " + getTotalCost();
    }
}
