package br.com.alura.knowledge05.module16;

import java.util.Collections;
import java.util.LinkedList;

public class Sort {
    public static void main(String[] args) {
        LinkedList<Lion> feline = new LinkedList<Lion>();

        Lion simba = new Lion("Simba", 2);
        Lion mufasa = new Lion("Mufasa", 12);
        Lion scar = new Lion("Scar", 10);

        feline.add(simba);
        feline.add(mufasa);
        feline.add(scar);

        Look look = new Look();

        Collections.sort(feline, look);
        Collections.reverse(feline);

        for(Lion lion: feline){
            System.out.println(lion);
        }

    }
}
