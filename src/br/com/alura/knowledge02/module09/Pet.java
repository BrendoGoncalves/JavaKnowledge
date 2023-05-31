package br.com.alura.knowledge02.module09;

public class Pet {
    public static void main(String[] args) {

        Dog dog1 = new Dog("German Shepherd");
        new Dog("Poodle");
        new Dog("Beagle");

        Address house = new Address();
        house.setStreet("Main Avenue");
        house.setStreetNumber(32);
        house.setCity("Philadelphia");
        dog1.adopt(house);

        System.out.println(Dog.getTotalDogs());
    }
}
