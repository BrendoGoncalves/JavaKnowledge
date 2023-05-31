package br.com.alura.knowledge03.module10;

public class Fish {

    public Fish(){
        System.out.println("Fish borns");
    }

    public void swim(){
        System.out.println("Fish swims");
        throw new IllegalStateException("It swims no more");
        //IllegalArgumentException
    }

    public void die(){
        System.out.println("Fish dies");
    }
}
