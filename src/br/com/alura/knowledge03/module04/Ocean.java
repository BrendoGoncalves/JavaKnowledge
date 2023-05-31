package br.com.alura.knowledge03.module04;

public class Ocean {
    public static void main(String[] args) {
        System.out.println("Main Beginning");
        try{
            atlanticOcean();
        }catch(ArithmeticException ex){
            String msg = ex.getMessage();
            System.out.println(msg);
        }catch(NullPointerException ex){
            String msg = ex.getMessage();
            System.out.println(msg);
        }
        System.out.println("Main End");
    }

    public static void atlanticOcean(){
        System.out.println("Atlantic Beginning");
        int numberException = 1 / 0;
        pacificOcean();
        System.out.println("Atlantic End");
    }

    public static void pacificOcean(){
        System.out.println("Pacific Beginning");
                Shark shark = null;
                shark.swim();
        System.out.println("Pacific End");
    }
}
