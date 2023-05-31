package br.com.alura.knowledge03.module09;

import br.com.alura.knowledge03.module03.Shark;

public class Ocean {
    public static void main(String[] args) {
        System.out.println("Main Beginning");
        try{
            atlanticOcean();
        }catch(MyException ex){
            String msg = ex.getMessage();
            System.out.println(msg);
        }
        System.out.println("Main End");
    }

    public static void atlanticOcean() throws MyException {
        System.out.println("Atlantic Beginning");
        pacificOcean();
        System.out.println("Atlantic End");
    }

    public static void pacificOcean() throws MyException{
        System.out.println("Pacific Beginning");
        Shark shark = new Shark();
        shark.swim();
        System.out.println("Pacific End");
    }
}
