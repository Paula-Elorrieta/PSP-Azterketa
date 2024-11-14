package Hilos.Ejer1;

public class Contador extends Thread {

	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("Hilo: " + Thread.currentThread().getName() + " - Contador: " + i);
		}
	}
	
}
