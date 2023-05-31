package br.com.alura.knowledge01;

public class Main14 {
    public static void main(String[] args) {
        /*
         * BREAK
         * CONTINUE
         */

        for(byte row = 1; row <= 3 ; row++){
            for(byte columm = 1; columm <= 3; columm++){
                System.out.println("Row: " + row + " Columm: " + columm);
            }
            System.out.println();
        }

        for(byte row = 1; row <= 3 ; row++){
            for(byte columm = 1; columm <= 3; columm++){
                if(row == 2){
                    break;
                }
                System.out.println("Row: " + row + " *Columm: " + columm);
            }
            System.out.println();
        }

        for(byte row = 1; row <= 3 ; row++){
            for(byte columm = 1; columm <= 3; columm++){
                if(columm == 2){
                    continue;
                }
                System.out.println("Row: " + row + " *Columm: " + columm);
            }
            System.out.println();
        }
    }
}
