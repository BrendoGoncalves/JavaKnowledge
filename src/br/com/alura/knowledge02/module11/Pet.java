package br.com.alura.knowledge02.module11;

public class Pet {
    public static void main(String[] args) {

        Canidae dog1 = new Dog("Brazilian Mastiff", "Yellow");
        Canidae wolf1 = new Wolf("Gray");

        //Canidae cani = new Canidae("Black");

        //dog1.bark();

        Wolf wolf2 = (Wolf) wolf1;

        wolf2.run("run");
        wolf2.run("run", "slowly");

        dog1.doAnything();
        wolf2.doAnything();
    }
}
