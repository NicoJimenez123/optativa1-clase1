public class Main {
    public static void main(String[] args) {
        System.out.println("Proceso en ejecución con PID: " + ProcessHandle.current().pid());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Proceso finalizado");
    }
}