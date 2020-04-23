package ejercicio6;

public class Repartidor extends Empleado{
	protected String zona;

	public Repartidor() {
		
	}

	public Repartidor(String nombre, int edad, double salario, String zona) {
		super(nombre, edad, salario);
		this.zona = zona;
	}
	
	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	public String toString() {
		String grupo = super.toString();
		grupo = grupo + " Zona: "+ zona;
		return grupo;
	}
	
	public void plus() {
		if (edad < 25 && zona == "zona 3") {
			salario = salario + PLUS;
		}
	}
}
