package Procesos.Ejer7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ejer7 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un texto: ");
        String inputText = scanner.nextLine();
        scanner.close();

        try {
            // Crear el comando para llamar a EjemploLectura
            ProcessBuilder processBuilder = new ProcessBuilder(
                "java", "Procesos.Ejer7.EjemploLectura", inputText
            );
            
            // Iniciar el proceso
            Process process = processBuilder.start();
            
            //java Procesos.Ejer7.Ejer7 en la terminal

            // Leer la salida del proceso EjemploLectura
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Esperar a que termine el proceso
            process.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
