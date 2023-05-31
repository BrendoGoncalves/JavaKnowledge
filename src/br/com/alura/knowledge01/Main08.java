package br.com.alura.knowledge01;

public class Main08 {
    public static void main(String[] args){
        /*
         * Estrutura de Condição
         * IF
         */

        char caracter = 'x';
        boolean option = false;

        /*
         * Operadores Lógicos
         *  && || !
         */

        if(caracter == 'x' && option == true){
            System.out.println("Blue");
        }else if(caracter == 'x' && option == false){
            System.out.println("Red");
        }else{
            System.out.println("Black");
        }

        if(caracter != 'x' || option != false){
            System.out.println("Yellow");
        }else if(caracter !='y' || option != true){
            System.out.println("Green");
        }else{
            System.out.println("White");
        }

        if(caracter != 'x' || !(option)){
            System.out.println("Yellow");
        }else if(caracter =='y' || option){
            System.out.println("Green");
        }else{
            System.out.println("White");
        }


    }
}
