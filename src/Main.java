import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       FileRepository repo = new FileRepository();
       ArrayList<DataInfo> datos = repo.leer();
       datos.forEach(dataInfo -> System.out.print(dataInfo.imprimir() + "\n"));
    }
}