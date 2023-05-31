package br.com.alura.knowledge06.module03;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Writing {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("breakfast2");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("eag butter fish");
        bw.newLine();
        bw.write("banana apple water");
        bw.close();
    }
}
