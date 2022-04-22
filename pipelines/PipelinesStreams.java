package pipelines;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PipelinesStreams {

    public static void main(String args[]){
        //1. Criar uma source
        List<String> animais = new ArrayList<>();
        animais.add("Gato");
        animais.add("Cachorro");
        animais.add("Pato");
        animais.add("Galinha");
        animais.add("Carneiro");
        animais.add("Vaca");
        animais.add("Porco");
        animais.add("Ganso");

        /** Optional **/
        String animalStringComValores = animais
                .stream()
                .reduce((animal1, animal2) -> animal1 + "," +animal2)
                .orElse("Lista VAZIA!");
        System.out.println("Valor com uma lista populada: "+animalStringComValores);

        ArrayList<String> listaVazia = new ArrayList<>();
        String animalStringVazia = listaVazia
                .stream()
                .reduce((animal1, animal2) -> animal1 + "," +animal2)
                .orElse("Lista VAZIA!");
        System.out.println("Valor com uma lista vazia: "+animalStringVazia);


        /** Operadores Intermediarios **/

        //filter
        animais
                .stream()
                .filter(a -> a.startsWith("G"))
                .forEach(a -> System.out.println(a));

        animais
                .stream()
                .filter(a -> a.endsWith("o"))
                .forEach(animal -> System.out.println(animal));


        //map
        Stream.of("Joao", "Jose", "Maria", "Maria")
                .map(nome -> new Pessoa(nome, nome.length()))
                .filter(pessoa -> pessoa.getIdade() > 4)
                .forEach(pessoa -> System.out.println(pessoa.toString()));

        animais
                .stream()
                .map(a -> a.toUpperCase())
                .forEach(a -> System.out.println(a));

        //flatmap
        List<List> cestaFrutas = new ArrayList<List>();
        List cesta1 = new ArrayList();
        cesta1.add("Laranja"); cesta1.add("Limao");
        List cesta2 = new ArrayList();
        cesta2.add("Morango"); cesta2.add("Framboesa");
        cestaFrutas.add(cesta1); cestaFrutas.add(cesta2);
        System.out.println(cestaFrutas);

        long quantidadeFrutas = cestaFrutas
                .stream()
                .flatMap(list -> list.stream())
                .count();
        System.out.println(quantidadeFrutas);

        //distinct
        animais.add("Ganso");
        animais
                .stream()
                .distinct()
                .forEach(animal -> System.out.println(animal));

        Stream.of("Joao", "Jose", "Maria", "Maria")
                .map(nome -> new Pessoa(nome, nome.length()))
                .distinct()
                .forEach(pessoa -> System.out.println(pessoa.toString()));


        //sorted
        animais
                .stream()
                .sorted()
                .forEach(a -> System.out.println(a));


        //limit
        animais
                .stream()
                .limit(2)
                .forEach(a -> System.out.println(a));

        //skip
        animais
                .stream()
                .skip(5)
                .forEach(a -> System.out.println(a));


        /** Operadores Terminais **/

        //Allmatch
        boolean todosAnimaisComecamComA = animais.stream().allMatch(a -> a.startsWith("A"));
        System.out.println("Todos os animais comecam com a letra A? " + todosAnimaisComecamComA);

        //AnyMatch
        boolean anyAnimaisComecamComA = animais.stream().anyMatch(a -> a.startsWith("A"));
        System.out.println("Pelo menos um animal comeca com a letra A? " + anyAnimaisComecamComA);

        //NoneMatch
        boolean nonAnimaisComecamComA = animais.stream().noneMatch(a -> a.startsWith("A"));
        System.out.println("Nenhum dos animais comecam com a letra A? " + anyAnimaisComecamComA);

        //collect
        System.out.println("\n Antes: " +animais);
        List animaisFiltrados = animais
                .stream()
                .filter(a -> a.startsWith("G"))
                .collect(Collectors.toList());
        System.out.println("\n Depois: " +animaisFiltrados);

        //count
        long count =  animais
                .stream()
                .count();

       System.out.println("Quantidade de animais" +count);

       //min
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(3);
        numeros.add(0);
        numeros.add(2);
       System.out.println("Menor numero: "+numeros.stream().min((n1, n2) -> n1 - n2));

       //max
       System.out.println("Maior numero: "+numeros.stream().max((n1, n2) -> n1 - n2));

       //reduce
        String animaisString = animais
                .stream()
                .reduce((animal1, animal2) -> animal1 + "" + animal2)
                .orElse("Valor nulo");
        System.out.println(animaisString);

    }
}
