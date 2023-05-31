package br.com.alura.knowledge02.module10;

public class Wolf extends Canidae{
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

    @Override
    public void canidaeAction(){
        super.canidaeAction();
        System.out.println("Wolf!");
    }
}
