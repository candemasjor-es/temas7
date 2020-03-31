package Ejercicio1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado empleado = new Empleado("Camilo", "12345678R", 32, false, 1000);
		Programador programa = new Programador("Miguel", "365274168", 32, true, 2000, 500, "Java y SQL");
		
		empleado.mostrarDatos();
		System.out.println();
		programa.mostrarDatos();
		System.out.println("Lineas: "+programa.getLineas()+" Lenguaje: "+programa.getLenguaje());
	}

}
