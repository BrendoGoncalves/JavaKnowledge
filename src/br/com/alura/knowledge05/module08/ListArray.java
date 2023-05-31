package br.com.alura.knowledge05.module08;

import java.util.ArrayList;

public class ListArray {
    public static void main(String[] args) {
        ArrayList<Lion> feline = new ArrayList<Lion>();

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
            if(simba2.getName() == lion.getName()){
                System.out.println("There is Simba yet.");
            }
        }

    }
}
