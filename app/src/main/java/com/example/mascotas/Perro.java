package com.example.mascotas;

public class Perro {
    String raza;
    String color;
    int age;
    String nombre;


    public Perro(String raza, String color, int age, String nombre) {
        this.raza = raza;
        this.color = color;
        this.age = age;
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public String getNombre() {
        return nombre;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
