package com.letscode.io;

import java.io.*;
import java.util.Scanner;

public class IOAPI {
    public static void main(String args []) throws IOException {
        copiarArquivo();
        copiarArquivoCatchException();
        editarArquivos();
        lerScanner();
    }

    public static void copiarArquivo() throws IOException { //Sinalizando que esse metodos pode gerar um IOException. Nao trato de alguma forma
        FileInputStream in = null;
        FileOutputStream out = null;


        try {
            //Localizacao: System.getProperty("user.dir")
            in = new FileInputStream("arquivoentrada.txt"); //Poderia causar um FileNotFoundException (filha de IOExceptioon), caso o arquivo nao exista
            //Localizacao: System.getProperty("user.dir")
            out = new FileOutputStream("arquivosaida.txt"); //Poderia causar um FileNotFoundException (filha de IOExceptioon), caso o arquivo nao exista
            int c;

            while ((c = in.read()) != -1) { //Byte de dados, representados por int, sendo lidos um a um ate um deles seja -1 (ou seja, final do arquivo)
                out.write(c);  //Escreve o mesmo arquivo no outpu ("outagain.txt"). Gera excecao (IOException) caso nao seja possivel.
            }
        } finally {
            if (in != null) {
                in.close(); //Gera excecao (IOException) caso nao seja possivel.
            }
            if (out != null) {
                out.close(); //Gera excecao (IOException) caso nao seja possivel.
            }
        }
    }

    public static void copiarArquivoCatchException() {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("arquivoentrada.txt"); //Poderia causar um FileNotFoundException (filha de IOExceptioon), caso o arquivo nao exista. Tratada no catch
            out = new FileOutputStream("arquivosaida.txt"); //Poderia causar um FileNotFoundException (filha de IOExceptioon), caso o arquivo nao exista. Tratada no catch
            int c;

            while ((c = in.read()) != -1) { //Byte de dados, representados por int, sendo lidos um a um ate um deles seja -1 (ou seja, final do arquivo)
                out.write(c);  //Escreve o mesmo arquivo no output ("outagain.txt").
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo nao encontrado ");
        } catch (IOException e) {
            System.out.println("Nao foi possivel escrever no arquivo especificado");
        } finally {
            try {
                if (in != null) {
                    in.close(); //Gera excecao (IOException) caso nao seja possivel.
                }
                if (out != null) {
                    out.close(); //Gera excecao (IOException) caso nao seja possivel.
                }
            } catch (IOException e) {
                System.out.println("Nao foi possivel fechar o stream dos arquivo especificado "+e.getMessage());
            }
        }
    }
    public static void editarArquivos() throws IOException {
        FileReader ler = new FileReader("arquivoentrada.txt");
        BufferedReader leitor = new BufferedReader(ler);

        FileOutputStream buffer = new FileOutputStream("arquivoeSaida2.txt");
        String linha;

        while((linha = leitor.readLine())!= null) {

            buffer.write(linha.getBytes());
        }
        buffer.close();

    }

    public static  void lerScanner(){
        String filename = "arquivoentrada.txt";
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
