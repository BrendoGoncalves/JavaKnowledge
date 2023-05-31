package br.com.alura.knowledge06.module02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.Reader;

public class Reading {
    public static void main(String[] args) throws IOException {
        InputStream fis = new FileInputStream("breakfast"); //FileNotFoundException
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        String line = br.readLine(); //IOException

        while(line != null){
            System.out.println(line);
            line = br.readLine();
        }

        br.close();

        /*
         * InputStream -> FileInputStream
         * Reader -> InputStreamReader and BufferedReader
         */
    }
}
