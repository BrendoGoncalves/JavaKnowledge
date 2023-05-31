package br.com.alura.knowledge02.module12;

public class Pet {
    public static void main(String[] args) {

        Animal dog1 = new Dog("Dalmat", "Black and White");
        Animal wolf1 = new Wolf("Black");

        dog1.excrete();
        wolf1.mate();

        Walk walk = new Walk();
        walk.walk(dog1);
    }
}
