package Ejercicio7;

public class division extends operacion {
	double division = numero_1 / numero_2;
	public division(double numero_1, double numero_2) {
		super(numero_1, numero_2);
		operacion = '/';
		resultado = division;
	}
}
