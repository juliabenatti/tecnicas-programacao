package com.letscode.lambda.exercicio;

public class Carrosel implements Brinquedo{
    @Override
    public boolean avaliarRequisitosBrinquedo(int idade, double altura) {
        if(idade >=6 && altura >1.30) {
            System.out.println("Pessoa permitida de entrar no brinquedo");
            return true;
        }
        System.out.println("Pessoa nao permitida de entrar no brinquedo");
        return false;
    }
}
