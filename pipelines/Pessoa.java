package pipelines;

import java.util.Objects;

public class Pessoa {
    int idade;
    String nome;

    public Pessoa(String nome, int idade) {
        this.idade = idade;
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    public boolean equals(Object object) {
        if (object instanceof Pessoa) {
            Pessoa pessoa = (Pessoa) object;
            return this.nome.equals(pessoa.nome) && (this.idade == pessoa.idade);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade);
    }
}
