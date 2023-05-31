package br.com.alura.knowledge03.module02;

public class Ocean {
    public static void main(String[] args) {
        System.out.println("Main Beginning");
        atlanticOcean();
        System.out.println("Main End");
    }

    public static void atlanticOcean(){
        System.out.println("Atlantic Beginning");
        pacificOcean();
        System.out.println("Atlantic End");
    }

    public static void pacificOcean(){
        System.out.println("Pacific Beginning");
        try{
            int numberException = 1 / 0;
        }catch(ArithmeticException ex){
            String msg = ex.getMessage();
            System.out.println(msg);
            ex.printStackTrace();
        }
        System.out.println("Pacific End");
    }
}
