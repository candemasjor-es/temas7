package Ejercicio5;

public class Principal {
	public static void main(String[] args) {
		Producto p1 = new Producto("camista", 50);
		Producto p2 = new Producto("Lapiz", 4);
		Perecedero p3 = new Perecedero("Usb memoria", 90, 5);
		Perecedero p4 = new Perecedero("cabella", 80, 3);
		NoPerecedero p5 = new NoPerecedero("pan", 801, 5);
		Producto[] Productos = new Producto[5];
		Productos[0] = p1;
		Productos[1] = p2;
		Productos[2] = p3;
		Productos[3] = p4;
		Productos[4] = p5;
		
		for (int i = 0;i < 5;i++) {
			System.out.println("Producto "+ (i+1));
			System.out.println(Productos[i].calcular(5));
		}
	}

}
