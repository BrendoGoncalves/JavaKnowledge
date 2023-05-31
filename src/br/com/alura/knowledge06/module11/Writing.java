package br.com.alura.knowledge06.module11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writing {
    public static void main(String[] args) throws IOException {
        FileWriter fr = new FileWriter("breakfast5");
        BufferedWriter bw = new BufferedWriter(fr);
        //BufferedWriter bw = new BufferedWriter(new FileWriter("breakfast5"));

        bw.write("Milk Tea Water");
        bw.newLine();
        bw.write("Jam Butter Cheese");
        bw.newLine();
        bw.close();
    }
}
