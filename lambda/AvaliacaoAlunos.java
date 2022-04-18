package com.letscode.lambda;

//import com.letscode.exemplo.Printable;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class AvaliacaoAlunos {

    public static void main(String args[]){

        //1. Convencional - criar objeto da classe que implementa a interface
        AvaliacaoImpl avaliacao = new AvaliacaoImpl();
        avaliacao.avaliar(1,2);

        //2. Chamar a classe por meio de outro metodo, passando o objeto
        avaliarAluno(avaliacao);

        //3. Passar a implementacao do metodo como parametro, ja que a classe
        // somente tem 1 objeto -- Exemplo, nao compilavel
        //Usando classe anonima
        //Observe que precisamos escrever muito para significar algo simples. Com a abordagem de lambda expressions podemos simplificar muito do boilerplate code e obter algo como
        avaliarAluno(new Avaliacao() {
            @Override
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
        });

        //4. Usando Lambda
        avaliarAluno(((nota, faltas) -> {
            if (nota > 5 && faltas <10) {
                System.out.println("Aluno aprovado");
                return true;
            }
            else {
                System.out.println("Aluno reprovado");
                return false;
            }
        }));

        //Ou usando essa forma
        Avaliacao avaliacaoObj = (nota, faltas) -> {
            if (nota > 5 && faltas <10) {
                System.out.println("Aluno aprovado");
                return true;
            }
            else {
                System.out.println("Aluno reprovado");
                return false;
            }
        };
        avaliarAluno(avaliacaoObj);

        //5. Permitir outras implementacoes do mesmo e usa-los
        Avaliacao avaliacao2 = (nota, faltas) -> {
            if (nota > 6 && faltas <10) {
                System.out.println("Aluno aprovado");
                return true;
            }
            else {
                System.out.println("Aluno reprovado");
                return false;
            }
        };
        avaliarAluno(avaliacao2);

        //6. ----- Podemos usar tambem Predicate ------ //
        avaliarAlunoPredicate(((nota, faltas) -> {
            if ((int)nota > 5 && (int)faltas <10) {
                System.out.println("Aluno aprovado");
                return true;
            }
            else {
                System.out.println("Aluno reprovado");
                return false;
            }
        }));
    }

    //Parte do passo 2
    static void avaliarAluno(Avaliacao avaliacao) {
        avaliacao.avaliar(6, 7);
    }


    //6. ----- Podemos usar tambem Predicate ------ //
    static void avaliarAlunoPredicate(BiPredicate avaliacao) {
        avaliacao.test(1, 2);
    }


}
