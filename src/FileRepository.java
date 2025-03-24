import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

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
        String line;
        ArrayList<DataInfo> datos = new ArrayList<DataInfo>();

        try (BufferedReader br = new BufferedReader(new FileReader(this.csvFile))) {
            // Leer línea por línea, mientras que la línea no sea nula
            while ((line = br.readLine()) != null) {
                // Dividir la línea en campos usando el separador
                String[] campos = line.split(this.csvSeparator);

                // Procesar
                DataInfo data = new DataInfo(Integer.parseInt(campos[0]), campos[1], Integer.parseInt(campos[2]), campos[3], Integer.parseInt(campos[4]));
                datos.add(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return datos;
    }
}
