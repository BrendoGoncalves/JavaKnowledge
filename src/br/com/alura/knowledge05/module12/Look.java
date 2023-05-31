package br.com.alura.knowledge05.module12;

import java.util.Comparator;

public class Look implements Comparator<Feline> {

    @Override
    public int compare(Feline f1, Feline f2) {
        Lion l1 = (Lion) f1;
        Lion l2 = (Lion) f2;

        if(l1.getAge() > l2.getAge()){
            return 1;
        }else if(l1.getAge() < l2.getAge()) {
            return -1;
        }else{
            return 0;
        }
    }
}
