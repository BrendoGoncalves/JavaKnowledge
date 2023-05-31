package br.com.alura.Knowledge06.module14;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Reading {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(new File("contas.csv"));
        //Scanner scanner = new Scanner(new FileInputStream("contas.csv"));

        while(scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}
