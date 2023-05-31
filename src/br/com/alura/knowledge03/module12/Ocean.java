package br.com.alura.knowledge03.module12;

public class Ocean {
    public static void main(String[] args) {
        Fish fish = null;
        try{
            fish = new Fish();
            fish.swim();
        }catch(IllegalStateException | NullPointerException ex){
            String msg = ex.getMessage();
            System.out.println(msg);
        }finally{
            if(fish != null){
                fish.die();
            }
        }
    }
}
