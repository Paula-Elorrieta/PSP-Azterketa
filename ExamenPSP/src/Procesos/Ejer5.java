package Procesos;

import java.io.IOException;

public class Ejer5 {
	
	// Haz un programa que detecte si el bloc de notas se está ejecutando y 
	// en caso afirmativo cree un proceso que lo elimine de la ejecución (matar el proceso).
	
	public static void main(String[] args) {
		
		// ejecutar el proceso notepad.exe
		
        String[] infoProceso = {"C:\\Windows\\System32\\notepad.exe"};
        
		try {
			Process pb = Runtime.getRuntime().exec(infoProceso);
			
			if (pb.isAlive()) {
				System.out.println("El proceso notepad.exe esta en ejecucion");
				System.out.println("Matando proceso...");
				// Destruye el proceso
				pb.destroy();
				System.out.println("Proceso eliminado");
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Otra forma de hacerlo  
		ProcessBuilder psBuilder = new ProcessBuilder("cmd, /c, C:\\Windows\\System32\\notepad.exe");
		try {
			Process p = psBuilder.start();
			if (p.isAlive()) {
				System.out.println("El proceso notepad.exe esta en ejecucion");
				System.out.println("Matando proceso...");
				// Destruye el proceso
				p.destroy();
				System.out.println("Proceso eliminado");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// La diferencia entre Runtime y ProcessBuilder es que Runtime es una clase que se utiliza para ejecutar un comando en el sistema y ProcessBuilder es una clase que se utiliza para crear un proceso

        
	}

}
