package br.com.alura.knowledge06.module19;

import java.io.*;

public class Serializacao {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.bin"));
        String name = (String) ois.readObject();
        ois.close();

        System.out.println(name);
    }
}
