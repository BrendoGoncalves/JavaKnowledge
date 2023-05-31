package br.com.alura.knowledge05.module02;

public class ArrayReference {
    public static void main(String[] args) {
        Lion[] lion = new Lion[3];

        Lion simba = new Lion();
        Lion mufasa = new Lion();
        Lion scar = new Lion();

        lion[0] = simba;
        lion[1] = mufasa;
        lion[2] = scar;

        lion[0].roar();
    }
}
