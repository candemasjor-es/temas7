package Ejercicio2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Profesor profesor = new Profesor("Camilo", "Aula214");
		profesor.setEdad(45);
		profesor.setHorarioTutorias("Lunes de 10:00 a 13:00");
		ProfesorEnfermo profesor_enfermo = new ProfesorEnfermo();
		profesor.getConsultas();
		profesor_enfermo.getConsultas();
	}

}
