package br.com.alura.knowledge05.module06;

import java.util.ArrayList;

public class ListArray {
    public static void main(String[] args) {
        ArrayList<Feline> feline = new ArrayList<Feline>();

        Feline simba = new Lion();
        Feline mufasa = new Lion();
        Feline scar = new Lion();

        feline.add(simba);
        feline.add(mufasa);
        feline.add(scar);

        feline.remove(scar);

        System.out.println(feline.get(1));

        //For-each
        for(Feline fe: feline){
            System.out.println(feline);
        }
    }
}
