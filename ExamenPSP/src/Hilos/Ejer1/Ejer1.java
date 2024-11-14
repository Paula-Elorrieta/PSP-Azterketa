package Hilos.Ejer1;

public class Ejer1 {
	
	// Ejecutar dos hilos. Tienen que contar hasta 1000  y una vez lleguen deben finalizar.
	
	public static void main(String[] args) {

		Contador hilo1 = new Contador();
		Contador hilo2 = new Contador();

		hilo1.start();
		hilo2.start();
	}
	
}
	



