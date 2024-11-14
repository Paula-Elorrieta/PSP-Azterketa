package Hilos.Synchronized;

public class main {
	 public static void main(String[] args) {
	        // Crear una cuenta con saldo inicial
	        CuentaBancaria cuenta = new CuentaBancaria(1000);

	        // Crear varias transacciones (hilos)
	        Transaccion t1 = new Transaccion(cuenta, 200);
	        Transaccion t2 = new Transaccion(cuenta, -150);
	        Transaccion t3 = new Transaccion(cuenta, 500);
	        Transaccion t4 = new Transaccion(cuenta, -200);

	        // Iniciar los hilos
	        t1.start();
	        t2.start();
	        t3.start();
	        t4.start();
	    }
	}
