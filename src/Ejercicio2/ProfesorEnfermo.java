package Ejercicio2;

public class ProfesorEnfermo extends Profesor {
	
	public ProfesorEnfermo() {
		
	}
	
	public @Override void getConsultas() {
		System.out.println("El profesor est� enfermo. Se suspenden las consultas hasta que se recupere. Disculpe las molestias.");
	}

}
