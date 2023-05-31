package br.com.alura.knowledge07.module02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListArray {
    public static void main(String[] args) {

        Country country1 = new Country("Brazil", 232000000);
        Country country2 = new Country("USA", 320000000);
        Country country3 = new Country("China", 1500000000);
        Country country4 = new Country("India", 1480000000);

        ArrayList<Country> countries = new ArrayList<>();
        countries.add(country1);
        countries.add(country2);
        countries.add(country3);
        countries.add(country4);

        Collections.sort(countries);
        System.out.println(countries);

        Collections.sort(countries, Comparator.comparing(Country::getPopulation));
        System.out.println(countries);
        countries.sort(Comparator.comparing(Country::getPopulation));
    }
}
