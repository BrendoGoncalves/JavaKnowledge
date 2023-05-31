package br.com.alura.knowledge03.module05;

public class Ocean {
    public static void main(String[] args) {
        System.out.println("Main Beginning");
        try{
            atlanticOcean();
        }catch(ArithmeticException | NullPointerException ex){
            String msg = ex.getMessage();
            System.out.println(msg);
        }
        System.out.println("Main End");
    }

    public static void atlanticOcean(){
        System.out.println("Atlantic Beginning");
        pacificOcean();
        System.out.println("Atlantic End");
    }

    public static void pacificOcean(){
        System.out.println("Pacific Beginning");
        ArithmeticException arithmetic = new ArithmeticException("Arithmetic");
        throw arithmetic;
        //System.out.println("Pacific End");
    }
}
