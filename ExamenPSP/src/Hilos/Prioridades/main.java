package Hilos.Prioridades;

public class main {
	
    public static void main(String[] args) {
        // Crear cinco hilos Corredor con diferentes prioridades
        Thread corredor1 = new Corredor("Corredor 1", Thread.MIN_PRIORITY);
        Thread corredor2 = new Corredor("Corredor 2", Thread.NORM_PRIORITY);
        Thread corredor3 = new Corredor("Corredor 3", Thread.NORM_PRIORITY + 1);
        Thread corredor4 = new Corredor("Corredor 4", Thread.NORM_PRIORITY + 2);
        Thread corredor5 = new Corredor("Corredor 5", Thread.MAX_PRIORITY);

        // Iniciar los hilos
        corredor1.start();
        corredor2.start();
        corredor3.start();
        corredor4.start();
        corredor5.start();
    }
}

