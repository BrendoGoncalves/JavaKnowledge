package br.com.alura.knowledge02.module07;

public class Dog {
    private String race;
    private Address home;

    public Dog(String race, String street, int streetNumber, String city){
        this.race = race;
        this.home = new Address(street, streetNumber, city);
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

    public void transfer(Address home){
        this.home = home;
    }
}
