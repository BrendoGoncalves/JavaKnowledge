package br.com.alura.knowledge02.module10;

public class Pet {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Brazilian Mastiff", "Yellow");
        dog1.weight = 50.0;
        dog1.height = 1.1;
        System.out.println(dog1.getWeight() + " - " + dog1.getHeight());

        Wolf wolf1 = new Wolf("Gray");
        Dog dog2 = new Dog("Beagle", "Brown");
        Wolf wolf2 = new Wolf("White");

        Canidae cani = new Canidae("Black");

        cani.canidaeAction();
        dog2.canidaeAction();
        wolf2.canidaeAction();

        System.out.println(Dog.getTotalCanidae());

    }
}
