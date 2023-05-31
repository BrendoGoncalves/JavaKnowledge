package br.com.alura.knowledge05.module17;

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

        feline.sort(new Comparator<Feline>() {

            @Override
            public int compare(Feline f1, Feline f2) {
                Lion l1 = (Lion) f1;
                Lion l2 = (Lion) f2;

                return Integer.compare(l1.getAge(), l2.getAge());
            }

        });

        for(Lion lion: feline){
            System.out.println(lion);
        }

    }
}
