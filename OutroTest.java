//1 - Definição do pacote
package com.letscode.util;

//2 - Definição dos imports
import java.time.*;

//3 Declaração da classe
public class OutroTest {
    //4 - Declaração das variaveis de instancia
    int anInt = 0;

    public static void main (String[] args){
        System.out.println(calculoSoma(1, 2));
    }

    //5 - Declaração de métodos
    public static int calculoSoma(int a, int b) {
        int soma = a + b;
        return soma;
    }

}
