package controller;

import model.DataInfo;
import view.DataView;
import repository.FileRepository;
import java.util.List;

public class DataController {
    private final FileRepository repository;
    private final DataView view;

    public DataController(FileRepository repository, DataView view) {
        this.repository = repository;
        this.view = view;
    }

    public void loadAndDisplayData() {
        try {
            List<DataInfo> data = repository.leer();
            view.displayData(data);
        } catch (Exception e) {
            view.displayError("Failed to load data: " + e.getMessage());
        }
    }
} 