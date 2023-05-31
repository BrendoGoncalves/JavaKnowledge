package br.com.alura.knowledge05.module04;

public class ArrayReference {
    public static void main(String[] args) {

        Feline simba = new Lion();
        Feline mufasa = new Lion();
        Feline scar = new Lion();

        Savannah savannah = new Savannah();

        savannah.addFeline(simba);
        System.out.println(savannah.getLastPosition() + " - " +savannah.getReferenceFeline(0));

        savannah.addFeline(mufasa);
        savannah.addFeline(scar);

        System.out.println(savannah.getLastPosition() + " - " +savannah.getReferenceFeline(2));
    }
}
