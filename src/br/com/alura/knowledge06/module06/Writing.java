package br.com.alura.knowledge06.module06;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Writing {
    public static void main(String[] args) throws IOException {
        OutputStream os = System.out;
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("I`m going to visit Israel.");
        bw.close();

    }
}
