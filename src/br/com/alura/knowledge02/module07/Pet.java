package br.com.alura.knowledge02.module07;

public class Pet {
    public static void main(String[] args) {

        Dog dog1 = new Dog("German Shepherd", "Maryland", 87, "Miami");

        System.out.println(dog1.getRace());
        System.out.println(dog1.getHome());
        System.out.println(dog1.getHome().getStreet());
        System.out.println(dog1.getHome().getStreetNumber());
        System.out.println(dog1.getHome().getCity());

        Address house = new Address("Louis Martin", 132, "Las Vegas");
        dog1.transfer(house);

        System.out.println(dog1.getRace());
        System.out.println(dog1.getHome().getStreet());
        System.out.println(dog1.getHome().getStreetNumber());
        System.out.println(dog1.getHome().getCity());

    }
}
