package com.letscode.zoologico;

public class Zoologico {

    public static void main(String args[]){
        Animal animal = new Animal("Urso");

        //animal.especie = "Urso";
        animal.idade = 12;
        animal.peso = 80.00;
        animal.tipoAlimentacao = "Carnivoro";
        animal.tipoLocomocao = "Anda";
        animal.tamanho = 1.80;

        System.out.println("Tipo de animal "+animal.especie);
        animal.comer();
        animal.dormir();

        Animal animal2 = new Animal();
        animal2.especie = "Pinguim";
        animal2.idade = 3;
        animal2.peso = 5.00;
        animal2.tipoAlimentacao = "Onivoro";
        animal2.tipoLocomocao = "Anda e nada";
        animal2.tamanho = 0.60;

        System.out.println("Tipo de animal "+animal2.especie);
        animal2.comer();
        animal2.dormir();

        Pato pato = new Pato();
        pato.comer();

        Animal animalPato = new Pato(); //Um pato SEMPRE sera um Animal.
                                        //Um Animal nem sempre sera um PATO (pode ser um coelho, leao...)
        animalPato.comer();

        Coelho coelho = new Coelho();

        alimentar(pato);
        alimentar(coelho);
        alimentar(animalPato);

    }

    public static void alimentar(Animal a) {
        a.comer();
    }
}
