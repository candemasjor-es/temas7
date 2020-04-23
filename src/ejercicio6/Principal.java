package ejercicio6;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado empleado1 = new Empleado("Camilo", 32, 2);
		Repartidor repartidor2 = new Repartidor("Oscar", 34, 3, "Zona 1");
		Comercial comercial3 = new Comercial("Seni", 42, 50, 200);
		
		System.out.println(empleado1.toString());
		System.out.println(repartidor2.toString());
		System.out.println(comercial3.toString());
		
		empleado1.plus();
		repartidor2.plus();
		comercial3.plus();
		
		System.out.println(empleado1.toString());
		System.out.println(repartidor2.toString());
		System.out.println(comercial3.toString());
	}

}
