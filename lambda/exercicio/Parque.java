package com.letscode.lambda.exercicio;

import java.util.function.BiPredicate;

public class Parque {

    public static void main (String args[]){

        //Convencional
        Brinquedo carrosel = new Carrosel();
        Brinquedo montanhaRussa = new MontanhaRussa();
        Brinquedo rodaGigante = new RodaGigante();

        requerimentoOk(carrosel);
        requerimentoOk(montanhaRussa);
        requerimentoOk(rodaGigante);

        //Classe anonima
        Brinquedo carrosselAn = new Brinquedo() {
            @Override
            public boolean avaliarRequisitosBrinquedo(int idade, double altura) {
                if(idade >=6 && altura >1.30) {
                    System.out.println("Pessoa permitida de entrar no brinquedo");
                    return true;
                }
                System.out.println("Pessoa nao permitida de entrar no brinquedo");
                return false;
            }
        };
        Brinquedo montanhaRussaAn = new Brinquedo() {
            @Override
            public boolean avaliarRequisitosBrinquedo(int idade, double altura) {
                if(idade >=16 && altura >1.55) {
                    System.out.println("Pessoa permitida de entrar no brinquedo");
                    return true;
                }
                System.out.println("Pessoa nao permitida de entrar no brinquedo");
                return false;
            }
        };
        Brinquedo rodaGiganteAn = new Brinquedo() {
            @Override
            public boolean avaliarRequisitosBrinquedo(int idade, double altura) {
                System.out.println("Pessoa permitida de entrar no brinquedo");
                return true;
            }
        };
        requerimentoOk(carrosselAn);
        requerimentoOk(montanhaRussaAn);
        requerimentoOk(rodaGiganteAn);

        //Lambda
        Brinquedo carrosselLambda = ((idade, altura) -> {
            if(idade >=6 && altura >1.30) {
                System.out.println("Pessoa permitida de entrar no brinquedo");
                return true;
            }
            System.out.println("Pessoa nao permitida de entrar no brinquedo");
            return false;
        });
        Brinquedo montanhaRussaLambda = ((idade, altura) -> {
            if(idade >=16 && altura >1.55) {
                System.out.println("Pessoa permitida de entrar no brinquedo");
                return true;
            }
            System.out.println("Pessoa nao permitida de entrar no brinquedo");
            return false;
        });
        Brinquedo rodaGiganteLambda = ((idade, altura) -> {
            System.out.println("Pessoa permitida de entrar no brinquedo");
            return true;
        });
        requerimentoOk(carrosselLambda);
        requerimentoOk(montanhaRussaLambda);
        requerimentoOk(rodaGiganteLambda);


        //Predicate
        requerimentoOkPredicate((idade, altura) -> {
            if((int)idade >=6 && (double)altura >1.30) {
                System.out.println("Pessoa permitida de entrar no brinquedo");
                return true;
            }
            System.out.println("Pessoa nao permitida de entrar no brinquedo");
            return false;
        });

        requerimentoOkPredicate((idade, altura) -> {
            if((int)idade >=16 && (double)altura >1.55) {
                System.out.println("Pessoa permitida de entrar no brinquedo");
                return true;
            }
            System.out.println("Pessoa nao permitida de entrar no brinquedo");
            return false;
        });

        requerimentoOkPredicate((idade, altura) -> {
            if((int)idade >=16 && (double)altura >1.55) {
                System.out.println("Pessoa permitida de entrar no brinquedo");
                return true;
            }
            System.out.println("Pessoa nao permitida de entrar no brinquedo");
            return false;
        });
    }

    public static void requerimentoOk(Brinquedo brinquedo) {
        brinquedo.avaliarRequisitosBrinquedo(7, 1.35);
    }

    public static void requerimentoOkPredicate(BiPredicate brinquedo) {
        brinquedo.test(7, 1.35);
    }
}
