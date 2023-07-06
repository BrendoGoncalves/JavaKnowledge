package br.com.alura.knowledge07.module03;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<Matter> matters = new ArrayList<Matter>();
        matters.add(new Matter("Math", 35));
        matters.add(new Matter("Phisics", 22));
        matters.add(new Matter("Chemistry", 25));
        matters.add(new Matter("Biology", 31));

        matters.sort(Comparator.comparing(Matter::getStudents));

        //matters.forEach(System.out::println);
        matters.forEach(m -> System.out.println(m.getName()));

        matters.stream().filter(m -> m.getStudents() > 30).forEach(m -> System.out.println(m.getName()+" > 30"));

        matters.stream().filter(m -> m.getStudents() > 30).
                map(m -> m.getStudents()).forEach(total -> System.out.println(total));

        matters.stream().filter(m -> m.getStudents() > 30).
                map(Matter::getStudents).forEach(System.out::println);

        int sum = matters.stream().filter(m -> m.getStudents() > 30).
                mapToInt(Matter::getStudents).sum();
    }
}
