package br.com.alura.knowledge05.module11;

import java.util.ArrayList;
import java.util.List;

public class Wrapper {
    public static void main(String[] args) {
        List objects = new ArrayList();

        objects.add(1); //?

        Integer integerObject = Integer.valueOf(1); //Wrapper
        int integerNmber = integerObject.intValue(); //Primitive

        String stringNumber = "10";
        int number = Integer.parseInt(stringNumber);

        boolean online = true;
        Boolean onlineObject = Boolean.FALSE;
        online = onlineObject.booleanValue();

        System.out.println(++integerObject);

        String turn = "true";
        boolean turn2 = Boolean.parseBoolean(turn);
        System.out.println(turn2);
    }
}
