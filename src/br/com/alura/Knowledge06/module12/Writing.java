package br.com.alura.Knowledge06.module12;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Writing {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("breakfast6");

        ps.println("Coffee milk");
        ps.println();
        ps.println("chocolate");
        ps.close();
    }
}
