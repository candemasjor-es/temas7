/**
*
* @autor: Camilo Mascarell Jorques
* Ejercicio 5 Tema 7 Herencia
* 
*/
package Ejercicio5;

public class Producto {
	protected String nombre;
	protected double precio;
	

	public Producto() { 
	}
	

	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	public double calcular(int cantidad) {
		double total = precio * cantidad;
		return total;
	}
	
	
	public String toString() {
		String todo = "Nombre: "+nombre+" Precio: "+precio;
		return todo;
		
	}

}
