package Hilos.Interrupciones;

public class main {
	public static void main(String[] args) throws InterruptedException {
        // Crear varios hilos que realizan tareas largas
        TareaLarga t1 = new TareaLarga();
        TareaLarga t2 = new TareaLarga();
        TareaLarga t3 = new TareaLarga();

        // Iniciar los hilos
        t1.start();
        t2.start();
        t3.start();

        // Dejar que los hilos trabajen por un tiempo
        Thread.sleep(2000); // Dejar que los hilos trabajen por 2 segundos

        // Interrumpir algunos hilos
        System.out.println("Interrumpiendo hilos...");
        t1.interrupt(); // Interrumpe el hilo t1
        t3.interrupt(); // Interrumpe el hilo t3

        // Esperar que los hilos terminen
        t1.join();
        t2.join();
        t3.join();

        System.out.println("Programa principal finalizado.");
    }
}
