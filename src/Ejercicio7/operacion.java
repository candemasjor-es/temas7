package Ejercicio7;

public class operacion {
	protected double numero_1, numero_2, resultado;
	protected char operacion = ' ';
	
	public operacion(double numero_1, double numero_2) {
		this.numero_1 = numero_1;
		this.numero_2 = numero_2;
	}
	
	public void mostrarResultado() {
		System.out.println(numero_1 + " " + operacion + " " + numero_2 + " = " + resultado);
	}
}
