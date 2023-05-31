package br.com.alura.knowledge05.module03;

public class ArrayReference {
    public static void main(String[] args) {
        Feline[] lion = new Lion[3];

        Lion simba = new Lion();
        Lion mufasa = new Lion();
        Lion scar = new Lion();

        lion[0] = simba;
        lion[1] = mufasa;
        lion[2] = scar;

        //Lion simba2 = lion[0]; ClassCastException
        Lion simba3 = (Lion) lion[0];

        Object[] animal = new Object[3];
    }
}
