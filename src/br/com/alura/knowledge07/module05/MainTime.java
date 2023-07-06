package br.com.alura.knowledge07.module05;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class MainTime {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate parisOlimpics = LocalDate.of(2024, Month.JULY, 24);

        int years = parisOlimpics.getYear() - today.getYear();
        System.out.println(years);

        Period pe = Period.between(today, parisOlimpics);
        System.out.println(pe);
        System.out.println(pe.getDays());

        LocalDate nextOlimpics = parisOlimpics.plusYears(4);
        System.out.println(nextOlimpics);

        DateTimeFormatter form = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String formatDate = parisOlimpics.format(form);
        System.out.println(formatDate);

        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter form2 = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        System.out.println(now.format(form2));

        LocalTime snackTime = LocalTime.of(15,30);
        System.out.println(snackTime);
    }
}
