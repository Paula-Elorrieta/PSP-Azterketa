package Procesos;

import java.io.File;
import java.io.IOException;

public class Ejer6 {
	
	// Programa que ejecuta un “.bat” previamente preparado y recoge la salida en un archivo y los errores en otro.
	
	//dame el bat
	
	public static void main(String[] args) {
        // Ruta al archivo .bat
        String batFilePath = "prueba.bat";

        // Archivos donde se almacenarán la salida y los errores
        // Si no existen, se crearán
        File outputFile = new File("salida.txt");
        File errorFile = new File("errores.txt");

        // Crear el proceso con ProcessBuilder
        ProcessBuilder processBuilder = new ProcessBuilder(batFilePath);
        
        // Redirigir salida estándar y errores a archivos
        processBuilder.redirectOutput(outputFile);
        processBuilder.redirectError(errorFile);

        try {
            // Iniciar el proceso
            Process process = processBuilder.start();
            // Esperar a que termine
            process.waitFor();
            System.out.println("Ejecución completa. Verifica 'salida.txt' y 'errores.txt'.");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
	
	// Para hacerlo con Runtime seria
//	 public static void main(String[] args) {
//	     // Ruta al archivo .bat
//	     String batFilePath = "prueba.bat";
//	
//	     // Archivos donde se almacenarán la salida y los errores
//	     // Si no existen, se crearán
//	     File outputFile = new File("salida.txt");
//	     File errorFile = new File("errores.txt");
//	
//	     try {
//	         // Crear el proceso con Runtime
//	         Process process = Runtime.getRuntime().exec(batFilePath);
//	
//	         // Redirigir salida estándar y errores a archivos
//	        process.getOutputStream().close();
//	        process.getInputStream().close();
//	        process.getErrorStream().close();
//	
//	        // Esperar a que termine
//	       process.waitFor();
//	        System.out.println("Ejecución completa. Verifica 'salida.txt' y 'errores.txt'.");
//	    } catch (IOException | InterruptedException e) {
//	        e.printStackTrace();
//	    }
//	}
	

}
