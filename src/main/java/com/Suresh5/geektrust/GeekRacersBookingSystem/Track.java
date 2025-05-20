package com.Suresh5.geektrust.GeekRacersBookingSystem;
// Track.java
import java.util.*;

public class Track {
    private TrackType type;
    private VehicleType vehicleType;
    private int capacity;
    private int costPerHour;
    private List<Booking> bookings = new ArrayList<>();

    public Track(TrackType type, VehicleType vehicleType, int capacity, int costPerHour) {
        this.type = type;
        this.vehicleType = vehicleType;
        this.capacity = capacity;
        this.costPerHour = costPerHour;
    }

    public boolean isAvailable(int startHour, int duration) {
        int count = 0;
        for (Booking b : bookings) {
            if (b.conflicts(startHour, duration)) count++;
        }
        return count < capacity;
    }

    public Booking book(VehicleType vType, int startHour, int duration, int extraHours, String vehicleId) {
        if (!isAvailable(startHour, duration + extraHours)) return null;
        Booking booking = new Booking(vType, type, startHour, duration, extraHours, costPerHour, vehicleId);
        bookings.add(booking);
        return booking;
    }

    public boolean release(String bookingId) {
        return bookings.removeIf(b -> b.getBookingId().equals(bookingId));
    }

    public List<Booking> getBookings() { return bookings; }
}
