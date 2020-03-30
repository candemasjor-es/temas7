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
        
        	System.out.println(e1.nombre+" tiene un "+ e1.getNotaMedia()+ " de media");
    		p1.getConsultas();
    }
}

