package Procesos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ejer3 {

	public static void main(String[] args) {
		// Optener la direccion MAC 
		
        ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "getmac");
        try {
        	
        	Process p = pb.start();
        	
        	System.out.println("parte 1");
            // mostramos en pantalla caracter a caracter
            InputStream is = p.getInputStream();
            System.out.println();
            int c;
            while ((c = is.read()) != -1) {
                System.out.print((char) c);
            }
            
            System.out.println("parte 2");
            // Mostrar linea a linea
            InputStream er = p.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(er));
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            er.close();
            System.out.println("end");
            
            
            // La diferencia entre el metodo anterior y este es que este metodo lee linea a linea y el otro caracter a caracter
            
        } catch (IOException e) {
            e.printStackTrace();
        }

	}

}
