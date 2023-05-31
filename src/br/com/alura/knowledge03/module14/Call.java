package br.com.alura.knowledge03.module14;

public class Call {
    public static void main(String[] args) {
        Priority pMin = Priority.MIN;
        Priority pMed = Priority.MEDIUM;
        Priority pMax = Priority.MAX;

        System.out.println(pMed.name());
        System.out.println(pMed.ordinal());
        System.out.println(pMed.getNumber());
    }
}
