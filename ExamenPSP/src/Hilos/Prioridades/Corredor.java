package Hilos.Prioridades;

public class Corredor extends Thread{
	
	private String nombre;
	// volatile es una palabra clave que se utiliza en variables para indicar que el valor de la variable
	// puede ser cambiado por diferentes hilos que se ejecutan al mismo tiempo
    private static volatile String ganador = null;


    // Constructor que recibe el nombre y la prioridad del corredor
    public Corredor(String nombre, int prioridad) {
        this.nombre = nombre;
        this.setPriority(prioridad);
    }

    
    // A pesar de tener prioridad alta, no se garantiza que el hilo termine primero que los demás
    @Override
    public void run() {
        // Simular la carrera
        for (int i = 0; i < 10; i++) {
            System.out.println(nombre + " corriendo... Prioridad: " + this.getPriority());
            try {
                // Añadir un breve retardo para simular el tiempo de carrera
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Verificar si este hilo es el ganador
        if (ganador == null) {
            ganador = nombre; // Asignar el nombre del ganador
            System.out.println(nombre + " ha terminado la carrera y es el GANADOR!");
        } else {
            System.out.println(nombre + " ha terminado la carrera.");
        }
    }
}


