package br.com.alura.knowledge05.module19;

import java.util.List;
import java.util.Vector;

public class VectorArray {
    public static void main(String[] args) {
        List<Lion> feline = new Vector<Lion>();
        //Thread Safe

        Lion simba = new Lion("Simba");
        Lion mufasa = new Lion("Mufasa");
        Lion scar = new Lion("Scar");

        feline.add(simba);
        feline.add(mufasa);
        feline.add(scar);

        for(Lion lion: feline){
            System.out.println(lion);
        }

    }
}
