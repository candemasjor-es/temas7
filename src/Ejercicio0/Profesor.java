package Ejercicio0;

public class Profesor extends Persona {
private String despacho, horarioTutorias;

	
	public Profesor(String nombre, String despacho) {
		this.nombre = nombre;
		this.despacho = despacho;
	}
	
	public String getDespacho() {
		return despacho;
	}

	public void setDespacho(String despacho) {
		this.despacho = despacho;
	}

	public String getHorarioTutorias() {
		return horarioTutorias;
	}

	public void setHorarioTutorias(String horarioTutorias) {
		this.horarioTutorias = horarioTutorias;
	}

	public void getConsultas() {
		System.out.println( nombre + " tiene tutoria los " + horarioTutorias + " en la sala " + despacho);
	}
}
