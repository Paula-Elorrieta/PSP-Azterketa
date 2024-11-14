package Hilos.Ejer3;

public class main {
	
    public static void main(String[] args) {
        Thread hiloNumeros = new Escritora(true);
        Thread hiloLetras = new Escritora(false);

        hiloNumeros.start();
        hiloLetras.start();
    }

}
