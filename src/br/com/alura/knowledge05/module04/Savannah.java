package br.com.alura.knowledge05.module04;

public class Savannah {
    Feline[] felines;
    int lastPosition;
    public Savannah(){
        felines = new Feline[10];
        lastPosition = 0;
    }

    public void addFeline(Feline feline){
        felines[lastPosition] = feline;
        lastPosition++;
    }
    public int getLastPosition(){
        return lastPosition;
    }

    public Feline getReferenceFeline(int position){
        return this.felines[position];
    }
}
