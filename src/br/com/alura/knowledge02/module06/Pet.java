package br.com.alura.knowledge02.module06;

public class Pet {
    public static void main(String[] args) {

        Address location1 = new Address();
        Dog dog1 = new Dog("German Shepherd", location1);
        System.out.println(dog1.getRace());
        System.out.println(dog1.getHome());

        dog1.getHome().setStreet("Ptr. Jhonson");
        dog1.getHome().setStreetNumber(456);
        dog1.getHome().setCity("New York");

        System.out.println(dog1.getRace());
        System.out.println(dog1.getHome());
        System.out.println(dog1.getHome().getStreet());
        System.out.println(dog1.getHome().getStreetNumber());
        System.out.println(dog1.getHome().getCity());


    }
}
