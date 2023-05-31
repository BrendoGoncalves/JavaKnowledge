package br.com.alura.knowledge05.module07;

import java.util.ArrayList;

public class OtherArrays {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList(10);

        ArrayList<Object> list3 = new ArrayList<Object>();
        ArrayList<Object> list4 = new ArrayList<Object>(10);

        ArrayList<Object> list5 = new ArrayList<Object>(list1);
        ArrayList list6 = new ArrayList(list1);

    }
}
