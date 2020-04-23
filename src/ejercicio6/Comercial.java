package ejercicio6;

public class Comercial extends Empleado {
	protected double comision;

	public Comercial() {
		
	}

	public Comercial(String nombre, int edad, double salario, double comision) {
		super(nombre, edad, salario);
		this.comision = comision;
	}
		
	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	public String toString() {
		String total = super.toString();
		total = total + " Comision: "+ comision;
		return total;
	}
	
	public void plus() {
		if (edad >= 30 && comision >= 200) {
			salario = salario + PLUS;
		}
	}

}
