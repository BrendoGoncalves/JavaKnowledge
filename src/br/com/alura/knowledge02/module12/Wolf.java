package br.com.alura.knowledge02.module12;

public class Wolf extends Canidae implements Animal {
    private double speed;

    public Wolf(String furColor){
        super(furColor);
    }

    public double getSpeed(){
        return this.speed;
    }

    public void setSpreed(double speed){
        this.speed = speed;
    }

    public void run(String running){
        this.run(running, "so fast");
    }

    public void run(String running, String mode){
        System.out.println(running + " - " + mode);
    }

    @Override
    public void canidaeAction(){
        super.canidaeAction();
        System.out.println("Wolf!");
    }

    @Override
    public void mate() {
        System.out.println("Wolf mates");
    }

    @Override
    public void excrete() {
        System.out.println("Wolf excretes");
    }
}
