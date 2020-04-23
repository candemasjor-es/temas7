package Ejercicio7;

public class suma extends operacion {
	double suma = numero_1 + numero_2;
	public suma(double numero_1, double numero_2) {
		super(numero_1, numero_2);
		operacion = '+';
		resultado = suma;
	}

}
