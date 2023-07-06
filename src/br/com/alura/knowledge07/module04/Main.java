package br.com.alura.knowledge07.module04;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Matter> matters = new ArrayList<Matter>();
        matters.add(new Matter("Math", 35));
        matters.add(new Matter("Phisics", 22));
        matters.add(new Matter("Chemistry", 25));
        matters.add(new Matter("Biology", 31));

        Optional<Matter> optionalMatter = matters.stream().
                filter(m -> m.getStudents() >= 30).findAny();

        Matter matter = optionalMatter.orElse(null);
        System.out.println(matter.getName());

        optionalMatter.ifPresent(m -> System.out.println(m.getName()));

        matters.stream().
                filter(m -> m.getStudents() >= 30).findAny().
                ifPresent(m -> System.out.println(m.getName()));

        OptionalDouble aver = matters.stream()
                .filter(m -> m.getStudents() >= 30).mapToInt(Matter::getStudents)
                .average();

        Stream<Matter> filter = matters.stream()
                .filter(m -> m.getStudents() >= 30);

        List<Matter> result = matters.stream().filter(m -> m.getStudents() >= 30)
                .collect(Collectors.toList());

        Map<String, Integer> map = matters.stream().filter(m -> m.getStudents() >= 30)
                .collect(Collectors.toMap(m -> m.getName(), m -> m.getStudents()));

        System.out.println(map);

        matters.stream().filter(m -> m.getStudents() >= 30)
                .collect(Collectors.toMap(m -> m.getName(), m -> m.getStudents()))
                .forEach((name, students) -> System.out.println(name + " has " +students));

        matters.parallelStream().filter(m -> m.getStudents() >= 30)
                .collect(Collectors.toMap(m -> m.getName(), m -> m.getStudents()))
                .forEach((name, students) -> System.out.println("Parallel: " +name+ " has " +students));
    }
}