package Hilos.Synchronized;

public class Transaccion extends Thread{
	 private CuentaBancaria cuenta;
	    private  double cantidad;

	    public Transaccion(CuentaBancaria cuenta, double cantidad) {
	        this.cuenta = cuenta;
	        this.cantidad = cantidad;
	    }

	    @Override
	    public void run() {
	        // Realizar una transacción (depositar o retirar)
	        cuenta.modificarSaldoConLock(cantidad);
	        // Si se usa synchronized en lugar de lock, simplemente llamaríamos:
	        // cuenta.modificarSaldoSynchronized(cantidad);
	        System.out.println("Saldo actual: " + cuenta.obtenerSaldo());
	    }
	}
