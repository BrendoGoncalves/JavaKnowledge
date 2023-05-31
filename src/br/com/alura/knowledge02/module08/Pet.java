package br.com.alura.knowledge02.module08;

public class Pet {
    public static void main(String[] args) {

        Dog dog1 = new Dog("German Shepherd");

        Address house = new Address();
        house.setStreet("Main Avenue");
        house.setStreetNumber(32);
        house.setCity("Philadelphia");

        dog1.adopt(house);

        System.out.println(dog1.getRace());
        System.out.println(dog1.getHome().getStreet());
        System.out.println(dog1.getHome().getStreetNumber());
        System.out.println(dog1.getHome().getCity());

    }
}
