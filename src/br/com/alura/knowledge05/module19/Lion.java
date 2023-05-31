package br.com.alura.knowledge05.module19;

public class Lion extends Feline {

    private String name;

    public Lion(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void roar(){
        System.out.println("Roarrrr!");
    }

    @Override
    public String toString(){
        return this.name;
    }

    @Override
    public boolean equals(Object obj){
        Lion lion = (Lion) obj;
        if(this.toString() != lion.toString()){
            return false;
        }
        return true;
    }
}
