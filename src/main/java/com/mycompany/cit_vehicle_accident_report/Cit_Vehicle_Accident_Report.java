/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.cit_vehicle_accident_report;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class Cit_Vehicle_Accident_Report {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the accident vehicle type: ");
        String vehicleType = scanner.nextLine();

        System.out.print("Enter the city for the vehicle accidents: ");
        String city = scanner.nextLine();

        System.out.print("Enter the  total vehicle accidents for the city: ");
        int numberOfAccidents = scanner.nextInt();

        RoadAccidentReport accidentReport = new RoadAccidentReport(vehicleType, city, numberOfAccidents);

        System.out.println(" VEHICLE ACCIDENT REPORT");
        accidentReport.printAccidentReport();
    }

    public interface IRoadAccidents {

        String getAccidentVehicleType();
        String getCity();
        int getAccidentTotal();
    }

    public static abstract class RoadAccidents implements IRoadAccidents {
        String typeOfVehicle;
        String accidentCity;
        int totalAccidents;

        public RoadAccidents(String typeOfVehicle, String accidentCity, int totalAccidents) {
            this.typeOfVehicle = typeOfVehicle;
            this.accidentCity = accidentCity;
            this.totalAccidents = totalAccidents;
        }

        @Override
        public String getAccidentVehicleType() {
            return typeOfVehicle;
        }

        @Override
        public String getCity() {
            return accidentCity;
        }

        @Override
        public int getAccidentTotal() {
            return totalAccidents;
        }
    }
}
