package br.com.alura.knowledge05.module18;

import java.util.ArrayList;
import java.util.Comparator;

public class Sort {
    public static void main(String[] args) {
        ArrayList<Lion> feline = new ArrayList<Lion>();

        Lion simba = new Lion("Simba", 2);
        Lion mufasa = new Lion("Mufasa", 12);
        Lion scar = new Lion("Scar", 10);

        feline.add(simba);
        feline.add(mufasa);
        feline.add(scar);

        feline.sort((Lion l1, Lion l2) -> {
                return Integer.compare(l1.getAge(), l2.getAge());
            }
        );

        feline.sort((l1, l2) -> Integer.compare(l1.getAge(), l2.getAge()));
        
        for(Lion lion: feline){
            System.out.println(lion);
        }

    }
}
