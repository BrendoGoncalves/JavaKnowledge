package br.com.alura.knowledge02.module05;

public class Pet {
    public static void main(String[] args) {
        Dog dog1 = new Dog("John", 2);
        System.out.println(dog1.getRace());
        System.out.println(dog1.getName());
        System.out.println(dog1.getAge());

        Dog dog2 = new Dog("Mary");
        System.out.println(dog2.getRace());
        System.out.println(dog2.getName());
        System.out.println(dog2.getAge());

        Dog dog3 = new Dog("Bulldog", "Mary", 7);
        System.out.println(dog3.getRace());
        System.out.println(dog3.getName());
        System.out.println(dog3.getAge());
    }
}
