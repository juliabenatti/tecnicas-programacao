package com.letscode.lambda.exercicio;

public class MontanhaRussa implements Brinquedo{
    @Override
    public boolean avaliarRequisitosBrinquedo(int idade, double altura) {
        if(idade >=16 && altura >1.55) {
            System.out.println("Pessoa permitida de entrar no brinquedo");
            return true;
        }
        System.out.println("Pessoa nao permitida de entrar no brinquedo");
        return false;
    }
}
