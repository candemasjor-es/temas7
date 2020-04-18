/**
*
* @autor: Camilo Mascarell Jorques
* Ejercicio 5 Tema 7 Herencia
* 
*/
package Ejercicio5;

public class NoPerecedero {
int tipo;
	
	
	public NoPerecedero() { 
	}
	
	
	public NoPerecedero(String nombre, double precio, int tipo) {
		super(nombre, precio);
		this.tipo = tipo;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	@Override 
	public double calcular(int cantidad) {
			  double total = super.calcular(cantidad);
			  return total;
		}

}
