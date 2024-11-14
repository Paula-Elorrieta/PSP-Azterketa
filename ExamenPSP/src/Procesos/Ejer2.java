package Procesos;

import java.io.IOException;
import java.io.InputStream;

public class Ejer2 {

	public static void main(String[] args) {
		// Ejecutar un comando de windows. (Dir, Taskmgr, …) y mostrar su resultado por pantalla.
        ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "dir");
        try {
            Process p = pb.start();
            // InputSteam es un flujo de entrada de bytes que se utiliza para leer datos binarios 
            // hay que leer de esta manera para que se muestre por pantalla el resultado
            InputStream is = p.getInputStream();
            int c;
            // EL metodo read() de InputStream devuelve un entero que representa el byte leido
            while ((c = is.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}