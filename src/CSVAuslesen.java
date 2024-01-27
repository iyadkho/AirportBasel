package src;

import src.dto.RequestDto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class CSVAuslesen {

    String dateiPfad = "C:\\Users\\zined\\OneDrive\\Desktop\\Alles\\Wiss\\Flughafen\\dateien\\basel_departures_3d.csv";


    public ArrayList<RequestDto> getCsvData() {

        try {
            FileReader fr = new FileReader(dateiPfad);
            BufferedReader br = new BufferedReader(fr);
            ArrayList<RequestDto> arrayList = new ArrayList<>();
            String zeile = "";

            int count = 0;
            while (null != (zeile = br.readLine())) {
                if (count > 0) {
                    String[] arr = zeile.split(",");
                    RequestDto requestDto = new RequestDto(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]);
                    arrayList.add(requestDto);
                }
              count++;
            }
            return arrayList;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    };
}
