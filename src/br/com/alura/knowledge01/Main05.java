package br.com.alura.knowledge01;

public class Main05 {
    public static void main(String[] args) {
        /*
         * Caracteres
         */
        char caracter = 'a';
        char position = 97;

        System.out.println(caracter);
        System.out.println(position);

        char caracter2 = (char) (position + 1);
        System.out.println(caracter2);

        /*
         * String
         * Variável de referência
         */

        String word = "Today";
        System.out.println(word);

        String phrase = word + " is a beautiful day " + caracter + caracter2 + position + 7;
        System.out.println(phrase);
    }
}
