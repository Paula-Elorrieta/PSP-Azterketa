package Hilos.Ejer4;

public class main {

	public static void main(String[] args) {
        Thread hilo1 = new DetonadorConRetardo("Detonador 1", 5);
        Thread hilo2 = new DetonadorConRetardo("Detonador 2", 7);
        Thread hilo3 = new DetonadorConRetardo("Detonador 3", 3);
        Thread hilo4 = new DetonadorConRetardo("Detonador 4", 4);

        // Iniciar los hilos
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();

        // Esperar a que todos los hilos terminen
        // .join() es un método que espera a que el hilo termine para continuar con la ejecución del programa principal
        // si quisiera matar un hilo en ejecución, se puede usar el método .interrupt() para interrumpir el hilo
        try {
            hilo1.join();
            hilo2.join();
            hilo3.join();
            hilo4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Todos los hilos han terminado. Finalizando el programa principal.");
    }
}
