package Hilos.Ejer3;

public class Escritora extends Thread {
	
	private boolean numeros;

	public Escritora(boolean numeros) {
		this.numeros = numeros;
	}

	@Override
    public void run() {
        while (true) {
            if (numeros) {
            	for (int i = 1; i <= 30; i++) {
                    System.out.print(i + " ");
                }
            } else {
                for (char c = 'a'; c <= 'z'; c++) {
                    System.out.print(c + " ");
                }
            }
            
            // Añadir una pausa para que se alternen las salidas
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
	