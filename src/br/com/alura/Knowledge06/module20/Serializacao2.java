package br.com.alura.Knowledge06.module20;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Serializacao2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object2.bin"));
        Lion lion = (Lion) ois.readObject();
        ois.close();

        System.out.println(lion.getName());
    }
}
