package br.com.alura.Knowledge06.module04;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.Reader;
import java.io.OutputStream;
import java.io.Writer;

public class ReadWrite {
    public static void main(String[] args) throws IOException {
        InputStream fis = new FileInputStream("breakfast");
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        OutputStream fos = new FileOutputStream("breakfast3");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        String line = br.readLine();

        while(line != null){
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        }

        br.close();
        bw.close();
    }
}
