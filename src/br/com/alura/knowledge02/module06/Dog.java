package br.com.alura.knowledge02.module06;

public class Dog {
    private String race;
    private Address home;

    public Dog(String race, Address home){
        this.race = race;
        this.home = home;
    }

    public String getRace(){
        return this.race;
    }

    public void setRace(String race){
        this.race= race;
    }

    public Address getHome(){
        return this.home;
    }

    public void setHome(Address home){
        this.home = home;
    }

    public void bark(){
        System.out.println("Au au!");
    }
}
