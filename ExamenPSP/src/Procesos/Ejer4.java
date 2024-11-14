package Procesos;

import java.io.IOException;
import java.io.InputStream;

public class Ejer4 {
	
	public static void main(String[] args) {
    	//Muesta los procesos en ejecucion
		
		// La diferencia entre  new ProcessBuilder("tasklist"); y new ProcessBuilder("cmd", "/c", "tasklist"); es que en el segundo se ejecuta el comando en la consola de windows y en el primero no
		// tasklist y ps -e son comandos que muestran los procesos en ejecucion
        ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "tasklist");
        try {
            Process p = pb.start();
            
            InputStream is = p.getInputStream();
            System.out.println();
            int c;
            while ((c = is.read()) != -1) {
                System.out.print((char) c);
            }
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}