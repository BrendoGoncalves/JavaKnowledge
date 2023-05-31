package br.com.alura.knowledge06.module13;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Writing {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("breakfast7");

        pw.println("Coffee milk");
        pw.println();
        pw.println("chocolate cookie");
        pw.close();

        long timeUnix = System.currentTimeMillis();
    }
}
