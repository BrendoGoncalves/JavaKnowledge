package br.com.alura.knowledge03.module08;

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
        Shark shark = new Shark();
        shark.swim();
        pacificOcean();
        System.out.println("Atlantic End");
    }

    public static void pacificOcean(){
        System.out.println("Pacific Beginning");
        System.out.println("Pacific End");
    }
}
