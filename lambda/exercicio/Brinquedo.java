package com.letscode.exercicio;

public interface Brinquedo {

    /**
     * Metodo para avaliar se a pessoa atende aos requisitos para usar determinado brinquedo
     * @param idade
     * @param altura
     * @return true caso a pessoa se encaixe nos requerimentos ou false caso nao se encaixe.
     */
    boolean avaliarRequisitosBrinquedo(int idade, double altura);

    }
