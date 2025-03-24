import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

public class FileRepository {
    private final String csvFile;
    private final String csvSeparator;

    public FileRepository(String csvFile, String csvSeparator) {
        this.csvFile = csvFile;
        this.csvSeparator = csvSeparator;
    }

    public FileRepository() {
        this.csvFile = "src/datos.csv";
        this.csvSeparator = ",";
    }

    public ArrayList<DataInfo> leer() {
        ArrayList<DataInfo> datos = new ArrayList<DataInfo>();

        try (Stream<String> lineas = Files.lines(Paths.get(csvFile))) {
            lineas
                .parallel() // Procesamiento en paralelo
                .map(linea -> linea.split(csvSeparator))
                .forEach(campos -> {
                    // Procesar
                    DataInfo data = new DataInfo(Integer.parseInt(campos[0]), campos[1], Integer.parseInt(campos[2]), campos[3], Integer.parseInt(campos[4]));
                    datos.add(data);
                });
        } catch (IOException e) {
            e.printStackTrace();
        }
        return datos;
    }
}
