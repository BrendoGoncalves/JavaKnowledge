package br.com.alura.knowledge03.module11;

public class Ocean {
    public static void main(String[] args) {
        Fish fish = null;
        try{
            fish = new Fish();
            fish.swim();
        }catch(IllegalStateException ex){
            String msg = ex.getMessage();
            System.out.println(msg);
        }finally{
            fish.die();
        }
    }
}
