package br.com.alura.knowledge06.module21;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Serializacao2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object3.bin"));
        Lion lion = (Lion) ois.readObject();
        ois.close();

        System.out.println(lion.getName());
    }
}
