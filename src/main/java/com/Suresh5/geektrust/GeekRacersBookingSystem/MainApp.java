package com.Suresh5.geektrust.GeekRacersBookingSystem;

import java.io.*;

public class MainApp {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Usage: java MainApp <inputFile> <outputFile> <auditFile> [startHour] [endHour]");
            return;
        }

        String inputFile = args[0];
        String outputFile = args[1];
        String auditFile = args[2];
        int startHour = args.length > 3 ? Integer.parseInt(args[3]) : 13;
        int endHour = args.length > 4 ? Integer.parseInt(args[4]) : 20;

        try {
            GeekRacersBookingSystem system = new GeekRacersBookingSystem(startHour, endHour, auditFile);
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            String line;
            while ((line = reader.readLine()) != null) {
                system.processCommand(line, outputFile);
            }
            system.closeAudit();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
