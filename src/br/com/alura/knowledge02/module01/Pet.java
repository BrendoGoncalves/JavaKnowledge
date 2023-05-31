package br.com.alura.knowledge02.module01;

public class Pet {
    public static void main(String[] args) {
        Dog dog1 = new Dog();

        System.out.println(dog1);

        dog1.race = "pit-bull";
        dog1.name = "Chop";
        dog1.age = 2;

        System.out.println(dog1.race);
        System.out.println(dog1.name);
        System.out.println(dog1.age);

        dog1.bark();
    }
}
