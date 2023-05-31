package br.com.alura.knowledge02.module11;

public abstract class Canidae {

    protected double weight;
    protected double height;
    protected String furColor;
    private static int totalCanidae;

    public Canidae(String furColor){
        this.furColor = furColor;
        Canidae.totalCanidae++;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public static int getTotalCanidae(){
        return Canidae.totalCanidae;
    }

    public void canidaeAction(){
        System.out.println("Canidae!");
    }

    public void hunt(boolean hunt){
        System.out.println(hunt ? "Its Hunting" : "Its not hunting");
    }

    public abstract void doAnything();

}
