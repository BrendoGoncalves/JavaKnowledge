package br.com.alura.knowledge01;

public class Main10 {
    public static void main(String[] args) {
        /*
         * Estrutura de Condição
         * SWITCH
         */
        byte color = 2;

        switch(color){
            case 1:
                System.out.println("Blue");
                break;
            case 2:
                System.out.println("Yellow");
                break;
            case 3:
                System.out.println("Red");
                break;
            case 4:
                System.out.println("Green");
                break;
            default:
                System.out.println("No color");
                break;
        }

    }
}
