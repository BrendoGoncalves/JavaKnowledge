package br.com.alura.knowledge05.module05;

import java.util.ArrayList;

public class ListArray {
    public static void main(String[] args) {
        ArrayList feline = new ArrayList();

        Feline simba = new Lion();
        Feline mufasa = new Lion();
        Feline scar = new Lion();

        feline.add(simba);
        feline.add(mufasa);
        feline.add(scar);

        feline.remove(scar);

        System.out.println(feline.get(1));

        for(int i = 0; i < feline.size(); i++){
            System.out.println(feline);
        }

        //For-each
        for(Object fe: feline){
            System.out.println(feline);
        }
    }
}
