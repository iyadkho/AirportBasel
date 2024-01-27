package src;

import src.dto.Flight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Objects;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CSVAuslesen {

    private ArrayList<Flight> arrayList;

    public CSVAuslesen(String dateiPfad) {
        parseData(dateiPfad);
    }

    public void parseData(String dateiPfad) {

        try {
            FileReader fr = new FileReader(dateiPfad);
            BufferedReader br = new BufferedReader(fr);
            ArrayList<Flight> arrayList = new ArrayList<>();
            String zeile = "";

            int count = 0;
            while (null != (zeile = br.readLine())) {
                if (count > 0) {
                    String[] arr = zeile.split(",");
                    Flight flight = new Flight(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]);
                    arrayList.add(flight);
                }
                count++;
            }
            this.arrayList = arrayList;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    ;

    public ArrayList<Flight> getFlightTable(String time) {

        // Parse the time strings into LocalTime objects
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime timeMethode = LocalTime.parse(time, formatter);
        ArrayList<Flight> arr = new ArrayList<>();
        for (Flight flight : arrayList) {
            LocalTime timeDatei = LocalTime.parse(flight.getTime(), formatter);
            if (timeDatei.isAfter(timeMethode)) {
                arr.add(flight);
            }
            if (arr.size() == 10) {
                return arr;
            }
        }
        return null;
    }

    public ArrayList<Flight> getArrayList() {
        return arrayList;
    }
}
