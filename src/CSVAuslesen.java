package src;

import src.dto.Flight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class CSVAuslesen {

    private ArrayList<Flight> arrayList;

    private String time;

    public CSVAuslesen(String dateiPfad, String time) {
        parseData(dateiPfad);
        getFlightTable(time);
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
        }catch (Exception e) {
            e.printStackTrace();
        }
    };

    public ArrayList<Flight> getFlightTable(String time) {

    }

    public ArrayList<Flight> getArrayList() {
        return arrayList;
    }
}
