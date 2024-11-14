package Hilos.Synchronized;

import java.util.concurrent.locks.ReentrantLock;

public class CuentaBancaria {
	 private double saldo;

	    // Constructor
	    public CuentaBancaria(double saldoInicial) {
	        this.saldo = saldoInicial;
	    }

	    // Método sin sincronización
	    // Modificar el saldo de manera insegura
	    public void modificarSaldoInseguro(double cantidad) {
	        saldo += cantidad;
	    }

	    // Método con synchronized para asegurar que solo un hilo modifique el saldo
	    // synchronized es una palabra clave que se puede usar en métodos o bloques para asegurar que solo un hilo pueda acceder a ellos a la vez.
	    public synchronized void modificarSaldoSynchronized(double cantidad) {
	        saldo += cantidad;
	    }

	    // Método con ReentrantLock para asegurar que solo un hilo modifique el saldo
	    private final ReentrantLock lock = new ReentrantLock();

	    // la diferencia entre synchronized y ReentrantLock es que el bloque synchronized es más simple de usar, pero ReentrantLock ofrece más flexibilidad y funcionalidades.
	    public void modificarSaldoConLock(double cantidad) {
	        lock.lock(); // Adquirir el lock
	        try {
	            saldo += cantidad;
	        } finally {
	            lock.unlock(); // Liberar el lock
	        }
	    }

	    // Método para obtener el saldo
	    public double obtenerSaldo() {
	        return saldo;
	    }
	}
