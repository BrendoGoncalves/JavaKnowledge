package br.com.alura.knowledge06.module15;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Reading {
    public static void main(String[] args) throws IOException {
        File paper = new File("contas.csv");
        Scanner scanner = new Scanner(paper);

        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            System.out.println(line);
            String[] words = line.split(",");
            System.out.println(words[3]);
        }
        scanner.close();
    }
}
