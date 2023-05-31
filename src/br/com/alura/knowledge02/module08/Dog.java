package br.com.alura.knowledge02.module08;

public class Dog {
    private String race;
    private Address home;

    public Dog(String race){
        this.race = race;
        new Address();
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

    public boolean adopt(Address home){
        if(this.home == null){
            this.home = home;
            home.goAway();
            return true;
        }
        return false;
    }
}
