package br.com.alura.knowledge04.module05;

public class Farm {
    public static void main(String[] args) {

        Duck duck1 = new Duck();
        System.out.println(duck1);
        System.out.println(duck1.toString());

        Object duck2 = new Duck();
        System.out.println(duck2.toString());
    }
}
