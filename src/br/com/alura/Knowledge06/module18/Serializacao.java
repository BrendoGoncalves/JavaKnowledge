package br.com.alura.Knowledge06.module18;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializacao {
    public static void main(String[] args) throws IOException {
        String name = "Mary";

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.bin"));
        oos.writeObject(name);
        oos.close();
    }
}
