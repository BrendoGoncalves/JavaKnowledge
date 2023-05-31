package br.com.alura.Knowledge06.module20;

import java.io.Serializable;

public class Lion implements Serializable {

    private static final long serialVersionUID = 1L;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void roar(){
        System.out.println("Roarrrr!");
    }
}
