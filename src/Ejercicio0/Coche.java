/*
 * Decompiled with CFR 0.137.
 */
package Ejercicio0;

public class Coche {
    private String marca;
    private String color;
    private String modelo;

    public Coche() {
    }

    public Coche(String marca, String color, String modelo) {
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}

