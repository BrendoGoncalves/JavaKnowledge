package br.com.alura.Knowledge06.module01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reading {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("breakfast"); //FileNotFoundException
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        String line = br.readLine(); //IOException

        System.out.println(line);

        br.close();
    }
}
