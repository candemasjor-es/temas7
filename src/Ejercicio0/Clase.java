/*
 * Decompiled with CFR 0.137.
 */
package Ejercicio0;

public class Clase {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        	p1.setNombre("Pepe");
        	p1.setEdad(10);
        Persona p2 = new Persona();
        	p2.setNombre("Luis");
        	p2.setEdad(25);
        Persona p3 = new Persona();
        	p3.setNombre("Maria");
        	p3.setEdad(20);
        	
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

