package br.com.alura.knowledge02.module04;

public class Dog {
    private String race;
    private String name;
    private int age;

    public Dog(String name, int age){
        this.race = "Poodle";
        this.name = name;
        this.age = age;
    }

    public Dog(){
    }

    public String getRace(){
        return this.race;
    }

    public void setRace(String race){
        this.race= race;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void bark(){
        System.out.println("Au au!");
    }
}
