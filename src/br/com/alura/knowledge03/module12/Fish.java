package br.com.alura.knowledge03.module12;

public class Fish {

    public Fish(){
        System.out.println("Fish borns");
        throw new IllegalStateException("But there is a problem");
    }
    public void swim(){
        System.out.println("Fish swims");
        throw new IllegalStateException("It swims no more");
    }
    public void die(){
        System.out.println("Fish dies");
    }
}
