package br.com.alura.knowledge05.module09;

import java.util.LinkedList;

public class Linked {
    public static void main(String[] args) {
        LinkedList<Lion> feline = new LinkedList<Lion>();

        Lion simba = new Lion("Simba");
        Lion mufasa = new Lion("Mufasa");
        Lion scar = new Lion("Scar");

        feline.add(simba);
        feline.add(mufasa);
        feline.add(scar);

        Lion simba2 = new Lion("Simba");

        boolean con = feline.contains(simba2);
        System.out.println(con);

        for(Lion lion: feline){
            System.out.println(lion);
        }

    }
}
