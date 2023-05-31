package br.com.alura.knowledge05.module14;

import java.util.Comparator;

public class Look implements Comparator<Feline> {

    @Override
    public int compare(Feline f1, Feline f2) {
        Lion l1 = (Lion) f1;
        Lion l2 = (Lion) f2;

        //return l1.getAge() - l2.getAge();

        return Integer.compare(l1.getAge(), l2.getAge());
    }
}
