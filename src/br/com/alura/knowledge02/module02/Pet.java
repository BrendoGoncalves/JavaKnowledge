package br.com.alura.knowledge02.module02;

public class Pet {
    public static void main(String[] args) {
        Dog dog1 = new Dog();

        System.out.println(dog1);

        dog1.race = "pit-bull";
        dog1.age = 2;

        Dog dog2;
        dog2 = dog1;
        System.out.println(dog2);

        Dog dog3 = new Dog();
        dog3 = dog2;
        System.out.println(dog3);

        new Dog();

        dog3.age +=2;

        System.out.println(dog3.age);

        if(dog1 == dog3){
            System.out.println("==");
        }
    }
}
