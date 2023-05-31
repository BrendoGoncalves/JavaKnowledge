package br.com.alura.knowledge03.module14;

public enum Priority {

    MIN(3), MEDIUM(6), MAX(9);
    private int number;

    Priority(int number){
        this.number = number;
    }

    public int getNumber(){
        return this.number;
    }
}
