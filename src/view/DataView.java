package view;

import model.DataInfo;
import java.util.List;

public class DataView {
    public void displayData(List<DataInfo> dataList) {
        if (dataList.isEmpty()) {
            System.out.println("No data to display.");
            return;
        }
        
        dataList.forEach(data -> System.out.println(data.toString()));
    }

    public void displayError(String message) {
        System.err.println("Error: " + message);
    }
} 