package src;

import src.dto.Flight;

import java.util.ArrayList;

public class Starter {

    public static void main(String[] args) {
        String dateiPfad = "C:\\Users\\zined\\OneDrive\\Desktop\\Alles\\Wiss\\Flughafen\\dateien\\basel_departures_3d.csv";
        String time = "06:10";
        CSVAuslesen csvAuslesen = new CSVAuslesen(dateiPfad);
        csvAuslesen.getArrayList();
        ArrayList<Flight> arr = csvAuslesen.getFlightTable(time);
        System.out.println();
    }
}
