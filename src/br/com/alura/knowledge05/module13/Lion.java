package br.com.alura.knowledge05.module13;

public class Lion extends Feline {

    private String name;
    private int age;

    public Lion(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return this.age;
    }

    public void roar(){
        System.out.println("Roarrrr!");
    }

    @Override
    public String toString(){
        return this.name;
    }

    @Override
    public boolean equals(Object obj){
        Lion lion = (Lion) obj;
        if(this.toString() != lion.toString()){
            return false;
        }
        return true;
    }
}
