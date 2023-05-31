package br.com.alura.knowledge04.module04;

public class Duck2 {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder("Duck");

        builder.append("-");
        builder.append("quack");
        builder.append(" ");
        builder.append("quack");

        String text = builder.toString();

        System.out.println(text);
    }
}
