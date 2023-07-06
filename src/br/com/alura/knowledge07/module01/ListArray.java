package br.com.alura.knowledge07.module01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;

public class ListArray {
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<>();

        String country1 = "Brazil";
        String country2 = "Nigeria";
        String country3 = "Japan";
        String country4 = "Italy";
        String country5 = "United States";
        String country6 = "Colombia";
        String country7 = "Australia";

        countries.add(country1);
        countries.add(country2);
        countries.add(country3);
        countries.add(country4);
        countries.add(country5);
        countries.add(country6);
        countries.add(country7);

        System.out.println(countries);

        for(int i = 0; i < countries.size(); i++){
            System.out.println(countries.get(i));
        }

        countries.remove(4);
        countries.remove(5);

        for(String country: countries ){
            System.out.println(country);
        }

        Collections.sort(countries);

        /*countries.forEach(new Consumer<String>(){
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
         */
        countries.forEach(country -> System.out.println(country));
        //Consumer<String> consumer = s -> System.out.println(s);
        //Consumer<String> consumer = System.out::println;

        countries.sort(Comparator.comparing(s -> s.length()));
        countries.sort(Comparator.comparing(String::length));

        /*
        Function<String, Integer> function = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };

        Function<String, Integer> function = String::legth;

        Comparator<String> comparator2 = Comparator.comparing(s -> s.length());
        countries.sort(comparator2);
         */
    }
}
