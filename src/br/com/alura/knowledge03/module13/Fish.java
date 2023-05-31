package br.com.alura.knowledge03.module13;

public class Fish implements AutoCloseable {

    public Fish(){
        System.out.println("Fish borns");
    }

    public void swim(){
        System.out.println("Fish swims");
        throw new IllegalStateException("It swims no more");
    }
    public void die(){
        System.out.println("Fish dies");
    }

    @Override
    public void close(){
        System.out.println("Fish dies throw closeable");
    }
}
