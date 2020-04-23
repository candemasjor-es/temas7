package Ejercicio7;

public class resta extends operacion {
	double resta = numero_1 - numero_2;
	public resta(double numero_1, double numero_2) {
		super(numero_1, numero_2);
		operacion = '-';
		resultado = resta;
	}
}