package br.com.alura.knowledge02.module03;

public class Pet {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        //dog1.race = Dalmatian;
        dog1.setRace("Dalmatian");
        String dogRace = dog1.getRace();

        System.out.println(dogRace);

        Dog dog2 = new Dog();
        dog2.setRace("Beagle");
        System.out.println(dog2.getRace());

        dog2.bark();
    }
}
