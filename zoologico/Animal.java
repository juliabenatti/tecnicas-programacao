package com.letscode.zoologico;

public class Animal {
    String especie;
    String tipoAlimentacao;
    int idade;
    String tipoLocomocao;
    double peso;
    double tamanho;

    public Animal(String especie) {
        this.especie = especie;
    }

    public Animal() {
    }

    public void comer() {
        System.out.println("Animal comendo!");
    }

    public void dormir() {
        System.out.println("Animal dormindo");
    }
}
