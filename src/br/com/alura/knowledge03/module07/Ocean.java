package br.com.alura.knowledge03.module07;

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

    public static void atlanticOcean() throws MyException{
        System.out.println("Atlantic Beginning");
        throw new MyException("MyException");
        //pacificOcean();
        //System.out.println("Atlantic End");
    }

    public static void pacificOcean(){
        System.out.println("Pacific Beginning");
        System.out.println("Pacific End");
    }
}
