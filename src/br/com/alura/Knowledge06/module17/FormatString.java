package br.com.alura.Knowledge06.module17;

import java.util.Locale;

public class FormatString {
    public static void main(String[] args) {

        String string1 = "Dolphin";
        String string2 = "Whale";
        double weight = 3.5;
        int age = 4;

        String text = String.format(new Locale("pt", "BR"), "%s and %20s " +
                "are aquatic animals. Weight: %08.4f Age: %02d %n", string1, string2, weight, age);
        System.out.println(text);
    }
}
