package org.arecap.codility.exercise01;

public class ParkingBill {
    
    public int computeTotalCostOfTicket(String E, String L) {
        String[] entryTime = E.split(":");
        String[] exitTime = L.split(":");

        int entryHour = Integer.parseInt(entryTime[0]);
        int entryMinute = Integer.parseInt(entryTime[1]);
        int exitHour = Integer.parseInt(exitTime[0]);
        int exitMinute = Integer.parseInt(exitTime[1]);

        int totalMinutes = (exitHour * 60 + exitMinute) - (entryHour * 60 + entryMinute);
        int totalHours = (totalMinutes + 59) / 60; // round up to the next hour

        if (totalHours <= 0) {
            return 2;
        }

        return 2 + 3 + (totalHours - 1) * 4;
    }
    
}
