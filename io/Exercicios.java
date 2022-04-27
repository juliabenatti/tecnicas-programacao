package com.letscode.io;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercicios {

    public static void main(String args[]) throws IOException {
        frases();
        pedraPorRochaNIO();
        ultimaModificacao();
        retirarLinhas();
    }

    //NIO
    private static void frases() throws IOException {
        Path path = Paths.get("arquivoFrases.txt");
        List<String> contents = Arrays.asList("Minhas frases", "Outra frase favorita");
        Files.write(path, contents, StandardCharsets.UTF_8,
                StandardOpenOption.CREATE);
    }

    private static void pedraPorRochaNIO() throws IOException {
        Path path = Paths.get("arquivoentrada.txt");
        Stream<String> content = Files.lines(path);
        List<String> lista = content.map(l -> {
            if (l.contains("pedra"))
                return l.replace("pedra", "rocha");
            return l;
        }).collect(Collectors.toList());

        Path saida = Paths.get("arquivoSaidaPedra.txt");
        Files.write(saida, lista, StandardCharsets.UTF_8,
                StandardOpenOption.CREATE);
    }

    private static void ultimaModificacao() throws IOException {
        Path path = Paths.get("arquivoentrada.txt");
        System.out.println("Last modified: "+Files.getLastModifiedTime(path));
    }

    private static void retirarLinhas() throws IOException {
        Path path = Paths.get("arquivoentrada.txt");
        Stream<String> stream = Files.lines(path);
        //Ou com character enconding especifico
        //Stream<String> stream = Files.lines(file, StandardCharsets.UTF_8);

        // aplica todos os filtros e exibe
        List<String> collect = stream
                .filter(l -> !l.isEmpty())
                .collect(Collectors.toList());
        Path saida = Paths.get("arquivoSaidaSemLinhaEmBranco.txt");
        Files.write(saida, collect, StandardCharsets.UTF_8,
                StandardOpenOption.CREATE);
    }

    //IO
    private static void criarArquivoNovo() throws IOException {
        FileOutputStream buffer = new FileOutputStream("frases.txt");
        String frase = "Quem acredita sempre alcanca!";
        buffer.write(frase.getBytes());
        buffer.close();
    }

    public static void pedraPorRocha() throws IOException {
        FileReader ler = new FileReader("arquivoentrada.txt");
        BufferedReader leitor = new BufferedReader(ler);


        FileOutputStream buffer = new FileOutputStream("arquivoeSaida2.txt");

        String linha;
        String linhaReescrita;

        while((linha = leitor.readLine())!= null) {
            linhaReescrita = linha + "\n";
            if (linha.contains("pedra")) {
                linhaReescrita = linha.replaceAll("pedra", "rocha") + "\n";
            }
            buffer.write(linhaReescrita .getBytes());
        }
        buffer.close();

    }
}
