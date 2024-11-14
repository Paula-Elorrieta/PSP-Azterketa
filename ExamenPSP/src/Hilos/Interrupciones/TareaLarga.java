package Hilos.Interrupciones;

public class TareaLarga extends Thread{
	
	 @Override
	    public void run() {
	        try {
	            for (int i = 0; i < 5; i++) {
	                if (Thread.interrupted()) {
	                    System.out.println(Thread.currentThread().getName() + " interrumpido.");
	                    return; // Salir si ha sido interrumpido
	                }
	                System.out.println(Thread.currentThread().getName() + " ejecutando tarea " + (i + 1));
	                Thread.sleep(1000); // Simula una tarea que toma tiempo
	            }
	        } catch (InterruptedException e) {
	            System.out.println(Thread.currentThread().getName() + " interrumpido durante el sleep.");
	        }
	    }
	}



