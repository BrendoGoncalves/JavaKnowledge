package br.com.alura.knowledge05.module12;

import java.util.ArrayList;

public class Sort {
    public static void main(String[] args) {
        ArrayList<Lion> feline = new ArrayList<Lion>();

        Lion simba = new Lion("Simba", 2);
        Lion mufasa = new Lion("Mufasa", 12);
        Lion scar = new Lion("Scar", 10);

        feline.add(simba);
        feline.add(mufasa);
        feline.add(scar);

        Look look = new Look();
        feline.sort(look);

        for(Lion lion: feline){
            System.out.println(lion);
        }

    }
}
