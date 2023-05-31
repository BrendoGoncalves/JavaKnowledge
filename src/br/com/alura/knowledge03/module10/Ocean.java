package br.com.alura.knowledge03.module10;

import br.com.alura.knowledge03.module03.Shark;

public class Ocean {
    public static void main(String[] args) {

        Fish fish = null;

        try{
            fish = new Fish();
            fish.swim();
            fish.die();
        }catch(IllegalStateException ex){
            String msg = ex.getMessage();
            System.out.println(msg);
        }

    }
}
