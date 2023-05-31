package br.com.alura.Knowledge06.module21;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializacao {
    public static void main(String[] args) throws IOException {
        Lion lion = new Lion();
        lion.setName("Mufasa");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object3.bin"));
        oos.writeObject(lion);
        oos.close();
    }
}
