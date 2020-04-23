package Ejercicio7;

public class multiplicacion extends operacion{
	double multiplicacion = numero_1 * numero_2;
	public multiplicacion(double numero_1, double numero_2) {
		super(numero_1, numero_2);
		operacion = 'X';
		resultado = multiplicacion;
	}

}
