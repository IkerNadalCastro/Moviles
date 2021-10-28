package com.example.intents;

public class objetointent {

    private String nombre;
    private int edad;
    private double altura;
    private String sexo;
    private double sueldo;

    @Override
    public String toString() {
        return "objetointent{ " + "nombre='" + nombre + ", edad=" + edad + ", altura=" + altura +
                ", sexo='" + sexo + ", sueldo=" + sueldo + " }";

    }

    public objetointent(String nombre, int edad, double altura, String sexo, double sueldo) {

        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.sexo = sexo;
        this.sueldo = sueldo;

    }
}
