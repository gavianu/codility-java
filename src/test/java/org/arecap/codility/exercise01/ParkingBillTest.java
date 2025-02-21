package org.arecap.codility.exercise01;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;



public class ParkingBillTest {

    @Test
    public void testComputeTotalCostOfTicket() {
        ParkingBill parkingLot = new ParkingBill();
        assertEquals(17, parkingLot.computeTotalCostOfTicket("10:00", "13:21"));
        assertEquals(9, parkingLot.computeTotalCostOfTicket("09:42", "11:42"));
        assertEquals(2, parkingLot.computeTotalCostOfTicket("10:00", "10:00"));
        assertEquals(5, parkingLot.computeTotalCostOfTicket("10:00", "10:30"));
        assertEquals(9, parkingLot.computeTotalCostOfTicket("10:00", "11:01"));
        assertEquals(9, parkingLot.computeTotalCostOfTicket("10:00", "11:30"));
       assertEquals(9, parkingLot.computeTotalCostOfTicket("10:00", "12:00"));
       assertEquals(13, parkingLot.computeTotalCostOfTicket("10:00", "12:30"));
    }
}