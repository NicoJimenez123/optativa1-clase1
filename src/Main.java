import controller.DataController;
import repository.FileRepository;
import view.DataView;

public class Main {
    public static void main(String[] args) {
        // Initialize components
        FileRepository repository = new FileRepository();
        DataView view = new DataView();
        DataController controller = new DataController(repository, view);

        // Execute main flow
        controller.loadAndDisplayData();
    }
}