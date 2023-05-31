package br.com.alura.knowledge02.module12;

public class Dog extends Canidae implements Animal {
    private String race;
    private Address home;

    private static int totalDogs;

    public Dog(String race, String furColor){
        super(furColor);
        this.race = race;
        new Address();
        Dog.totalDogs++;
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

    public static int getTotalDogs(){
        return Dog.totalDogs;
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

    @Override
    public void canidaeAction(){
        super.canidaeAction();
        System.out.println("Dog!");
    }

    @Override
    public void mate() {
        System.out.println("Dog mates");
    }

    @Override
    public void excrete() {
        System.out.println("Dog excretes");
    }
}
