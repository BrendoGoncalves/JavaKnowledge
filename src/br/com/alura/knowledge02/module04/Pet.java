package br.com.alura.knowledge02.module04;

public class Pet {
    public static void main(String[] args) {
        Dog dog1 = new Dog("John", 2);
        System.out.println(dog1.getRace());
        System.out.println(dog1.getName());
        System.out.println(dog1.getAge());
    }
}
