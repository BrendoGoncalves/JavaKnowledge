package br.com.alura.knowledge03.module13;

public class Ocean {
    public static void main(String[] args) {

        try(Fish fish = new Fish()){
            fish.swim();
        }catch(IllegalStateException ex){
            String msg = ex.getMessage();
            System.out.println(msg);
        }
    }
}
