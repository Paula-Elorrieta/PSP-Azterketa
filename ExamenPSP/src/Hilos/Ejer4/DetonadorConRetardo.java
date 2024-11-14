package Hilos.Ejer4;

public class DetonadorConRetardo extends Thread{
	
	private String nombre;
	private int contador;
	
	public DetonadorConRetardo(String nombre, int contador) {
        this.nombre = nombre;
        this.contador = contador;
    }

    @Override
    public void run() {
        // Ejecutar hasta que el contador llegue a 0
        while (contador > 0) {
            System.out.println(nombre + ": " + contador);
            contador--;

            // Añadir una pausa para simular el retardo
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        // Mensaje al terminar la cuenta regresiva
        System.out.println(nombre + " ha terminado su cuenta regresiva.");
    }
}
