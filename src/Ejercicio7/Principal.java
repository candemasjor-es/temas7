package Ejercicio7;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		suma suma = new suma(50, 40);
		resta resta = new resta(12, 33);
		multiplicacion multiplicacion = new multiplicacion(10, 2);
		division division = new division(100, 50);
		
		suma.mostrarResultado();
		resta.mostrarResultado();
		multiplicacion.mostrarResultado();
		division.mostrarResultado();

	}

}
