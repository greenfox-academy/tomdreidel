package parkinglot;

import java.util.Collections;

public class Main {

  public static void main(String[] args) {

    ParkingLot parkingLot = new ParkingLot(256);

    parkingLot.countType();
    parkingLot.countColor();




  }
}

//  Create a Car class with 2 enum properties
//enum of car types
//    The types of these cars or vehicles is up to you
//enum of colors
//    Create 256 Vehicles randomly and put them into a List
//    Count and Print the number of same vehicles for each type
//    Count and Print the number of same vehicles for each color
//    Print the most frequently occurring vehicle