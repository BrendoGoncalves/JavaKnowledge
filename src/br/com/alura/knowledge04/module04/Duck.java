package br.com.alura.knowledge04.module04;

public class Duck {
    public static void main(String[] args) {
        String duck = "Duck";
        String duck2 = duck.replace('D', 'd');
        String duck3 = duck.replace("Du", "DU");

        System.out.println(duck + " " + duck2 + " " + duck3);

        char caractere = duck.charAt(3);
        System.out.println(caractere);

        int position = duck.indexOf('c');
        System.out.println(position);
        int position2 = duck.indexOf("uc");
        System.out.println(position2);

        int size = duck.length();
        System.out.println(size);

        for(int i = 0; i < duck.length(); i++){
            System.out.println(duck.charAt(i));
        }

        String sub = duck.substring(2);
        System.out.println(sub);

        String duck4 = "";
        boolean duckEmpty = duck4.isEmpty();
        System.out.println(duckEmpty);

        String duck5 = "   duck    ";
        System.out.println(duck5.trim());

        boolean duck5Cont = duck5.contains("uc");
        System.out.println(duck5Cont);
    }
}
