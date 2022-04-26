package com.letscode.lambda.exercicio;

public class RodaGigante implements Brinquedo{
    @Override
    public boolean avaliarRequisitosBrinquedo(int idade, double altura) {
        System.out.println("Pessoa permitida de entrar no brinquedo");
        return true;
    }
}
