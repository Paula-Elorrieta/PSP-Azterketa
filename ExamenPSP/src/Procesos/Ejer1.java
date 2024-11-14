package Procesos;

import java.io.IOException;

public class Ejer1 {

	public static void main(String[] args) throws InterruptedException {
		
		// Ejecutar una aplicación de Windows. (Bloc de notas, Word, …)
		String[] infoProceso = {"C:\\Users\\Usuario\\OneDrive\\Escritorio\\Juegos\\publish2\\Ryujinx.exe"};
		
		try {
			// pb es un objeto de la clase ProcessBuilder que recibe como parametro el comando a ejecutar en el sistema
			// infoProceso es un array de String que contiene el comando a ejecutar, tiene que ser un ejecutable 
			Process pb = Runtime.getRuntime().exec(infoProceso);
			System.out.println("Id del proceso: "+ pb.pid());
			System.out.println("Nombre del proceso: "+ pb.info().toString());
			System.out.println("Estado del proceso: "+ pb.isAlive());
			System.out.println("Tiempo de ejecucion del proceso: "+ pb.info().totalCpuDuration());
			System.out.println("Tiempo de inicio del proceso: "+ pb.info().startInstant());
			// Espera a que el proceso termine para seguir con la ejecucion del programa
			int retorno = pb.waitFor();
			System.out.println("El proceso ha terminado con el codigo de retorno: "+ retorno);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
