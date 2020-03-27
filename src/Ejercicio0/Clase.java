/*
 * Decompiled with CFR 0.137.
 */
package Ejercicio0;

public class Clase {
    public static void main(String[] args) {
    	Estudiante e1 = new Estudiante("Juan", "1ºDAM", 12345);
		e1.setEdad(20);
		
		double[] notas = new double[7];
		notas[0] = 7;
		notas[1] = 8.5;
		notas[2] = 4;
		notas[3] = 8;
		notas[4] = 6;
		notas[5] = 7.5;
		notas[6] = 5;

		Profesor p1 = new Profesor("Fernando", "D104");
		p1.setEdad(45);
		p1.setHorarioTutorias("Lunes de 10:00 a 13:00");
        	
        Coche grupo_1 = new Coche();
        	grupo_1.setColor("Rojo");
        	grupo_1.setMarca("Renault");
        	grupo_1.setModelo("Clio");
        
        Coche grupo_2 = new Coche();
        	grupo_2.setColor("Azul");
        	grupo_2.setMarca("Ford");
        	grupo_2.setModelo("Fiesta");
        
        System.out.println("Nombre " + p1.getNombre()+" tienes "+p1.getEdad()+" años, Coche marca: " +grupo_1.getMarca()+ " Modelo: "+grupo_1.getModelo()+" Calor: "+grupo_1.getColor() );
        System.out.println("Nombre " + p2.getNombre()+" tienes "+p2.getEdad()+" años, Coche marca: " +grupo_1.getMarca()+ " Modelo: "+grupo_1.getModelo()+" Calor: "+grupo_1.getColor() );
        System.out.println("Nombre " + p3.getNombre()+" tienes "+p3.getEdad()+" años, Coche marca: " +grupo_2.getMarca()+ " Modelo: "+grupo_2.getModelo()+" Calor: "+grupo_2.getColor()  );
        
    }
}

