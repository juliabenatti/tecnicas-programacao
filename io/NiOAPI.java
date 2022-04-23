package com.letscode.io;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class NiOAPI {
    public static void main(String args[]){
//        Exemplos (path nao valido necessariamente)
//        Paths.get(URI.create("file:///arquivoentrada.txt"));            // Usando URI
//        Paths.get("arquivoentrada.txt");                                //Usando String
//        Paths.get(System.getProperty("user.home"),"logs", "foo.log"); //Usando propriedades do sistema

        Path path = Paths.get("arquivoentrada.txt");

        metadata(path);
        readAllBytes(path);
        readAllLines(path);
        lines(path);

        Path newFile = Paths.get("arquivoNIO.txt");
        createAndwriteFile(newFile);
        appendToFile(newFile);
    }

    public static void metadata(Path file){
        boolean isRegularExecutableFile = Files
                .isRegularFile(file) &
                Files.isReadable(file) &
                Files.isExecutable(file);
    }

    /** le o arquivo de texto e o transforma em um array of bytes **/
    public static void readAllBytes(Path file){
        try {
            // le todos os bytes
            byte[] bytes = Files.readAllBytes(file);

            // converte bytes para string
            String content = new String(bytes);

            System.out.println(content);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /**le o arquivo de texto linha por linha e o transforma em uma List<String>. Padrao de character enconding: UTF-8 **/
    public static void readAllLines(Path file){
        try {
            // le todas as linhas
            List<String> lines = Files.readAllLines(file);
            //Ou com character enconding especifico
            //List<String> lines = Files.readAllLines(file, StandardCharsets.UTF_16);

            // print todas as linhas
            for (String line : lines) {
                System.out.println(line);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    /** le o arquivo linha por linha usando Java 8 Stream API **/
    public static void lines(Path file){
        try {
            // inicializa as linhas do stream
            Stream<String> stream = Files.lines(file);
            //Ou com character enconding especifico
            //Stream<String> stream = Files.lines(file, StandardCharsets.UTF_8);

            // aplica todos os filtros e exibe
            stream.map(String::trim)
                    .filter(l -> !l.isEmpty()) //redira todas as linhas em branco
                    .forEach(System.out::println);

            // fecha o stream
            stream.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /** Criar o arquivo e adicionar **/
    public static void createAndwriteFile(Path file){
        try {
            // informacao para escrever
            List<String> contents = Arrays.asList("Hey, there", "How are you doing?");

            // escrever para o arquivo
            Files.write(file, contents,
                    StandardCharsets.UTF_8,
                    StandardOpenOption.CREATE);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /** Adiciona (sem sobrescrever) - Append**/
    public static void appendToFile(Path file){
        try {
            // informacao para escrever
            List<String> contents = Arrays.asList("Hey, is it an append?");

            // escrever para o arquivo
            Files.write(file, contents,
                    StandardCharsets.UTF_8,
                    StandardOpenOption.APPEND);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
