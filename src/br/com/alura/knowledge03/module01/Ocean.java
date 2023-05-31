package br.com.alura.knowledge03.module01;

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
        int numberException = 1 / 0;
        System.out.println("Pacific End");
    }
}
