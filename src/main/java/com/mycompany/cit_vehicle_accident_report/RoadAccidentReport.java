/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cit_vehicle_accident_report;

/**
 *
 * @author RC_Student_lab
 */
 public class RoadAccidentReport extends Cit_Vehicle_Accident_Report.RoadAccidents {
    
        public RoadAccidentReport(String typeOfVehicle, String accidentCity, int totalAccidents) {
            super(typeOfVehicle, accidentCity, totalAccidents);
        }

        public void printAccidentReport() {
            System.out.println("****************************************");
            System.out.println("VEHICLE TYPE: " + getAccidentVehicleType());
            System.out.println("City: " + getCity());
            System.out.println("ACCIDENT TOTAL: " + getAccidentTotal());
            System.out.println("****************************************");
        }
}
