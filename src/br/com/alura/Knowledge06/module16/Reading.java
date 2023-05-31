package br.com.alura.Knowledge06.module16;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Reading {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("contas.csv"));

        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            System.out.println(line);

            Scanner scanner2 = new Scanner(line);
            scanner2.useLocale(Locale.US);
            scanner2.useDelimiter(",");

            String string1 = scanner2.next();
            //int string2 = Integer.parseInt(scanner2.next());
            int string2 = scanner2.nextInt();
            int string3 = scanner2.nextInt();
            String string4 = scanner2.next();
            double string5 = scanner2.nextDouble();

            System.out.println(string1);
            System.out.println(string2);
            System.out.println(string3);
            System.out.println(string4);
            System.out.println(string5);
        }
        scanner.close();
    }
}
