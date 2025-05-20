package com.Suresh5.geektrust.GeekRacersBookingSystem;
// GeekRacersBookingSystemTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

public class GeekRacersBookingSystemTest {
    @Test
    public void testSuccessfulBikeBooking() throws IOException {
        GeekRacersBookingSystem system = new GeekRacersBookingSystem(13, 20, "audit_test.log");
        String bookingId = system.bookTrack(VehicleType.BIKE, 13, 180, "VTest1");
        assertNotNull(bookingId);
    }

    @Test
    public void testRejectedOverCapacity() throws IOException {
        GeekRacersBookingSystem system = new GeekRacersBookingSystem(13, 20, "audit_test.log");
        for (int i = 0; i < 4; i++) {
            system.bookTrack(VehicleType.BIKE, 13, 180, "VTest" + i);
        }
        // 5th booking should fail
        String bookingId = system.bookTrack(VehicleType.BIKE, 13, 180, "VTestExtra");
        assertNull(bookingId);
    }

    @Test
    public void testReleaseBooking() throws IOException {
        GeekRacersBookingSystem system = new GeekRacersBookingSystem(13, 20, "audit_test.log");
        String bookingId = system.bookTrack(VehicleType.CAR, 13, 200, "VCarTest");
        assertNotNull(bookingId);
        boolean released = system.releaseTrack(bookingId);
        assertTrue(released);
    }
}
