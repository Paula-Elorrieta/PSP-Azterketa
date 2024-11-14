package Hilos.Ejer2.ejer1;

public class main {

	public static void main(String[] args) {
	
		//Emplea isAlive para chequear cuándo acaban los hilos
		
		HiloRunnable hilo1 = new HiloRunnable();
		HiloRunnable hilo2 = new HiloRunnable();
		
		Thread t1 = new Thread(hilo1);
		Thread t2 = new Thread(hilo2);
		
		t1.start();
		t2.start();
		
		while (t1.isAlive() || t2.isAlive()) {
			System.out.println("Hilo 1: " + t1.isAlive() + " Hilo 2: " + t2.isAlive());
		}

	}

}
