package com.letscode.lambda;

public class AvaliacaoImpl implements Avaliacao {

    //E se quisermos varias formas de avaliar?
    public boolean avaliar(double nota, int faltas) {
        if (nota > 5 && faltas <10) {
            System.out.println("Aluno aprovado");
            return true;
        }
        else {
            System.out.println("Aluno reprovado");
            return false;
        }
    }
}
