package br.com.alura.Knowledge06.module10;

import java.io.FileWriter;
import java.io.IOException;

public class Writing {
    public static void main(String[] args) throws IOException {
        FileWriter fr = new FileWriter("breakfast5");

        fr.write("Milk Tea Water");
        fr.write("\n");
        fr.write("Jam Butter");
        fr.write(System.lineSeparator());
        fr.close();
    }
}
