package br.com.alura.knowledge05.module01;
// Java Lang
public class Array {
    public static void main(String[] args){
        int[] array = new int[4];
        array[0] = 10;
        array[1] = 11;
        array[2] = 12;
        array[3] = 13;

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

        double[] array2 = {1.1, 2.2, 3.3, 4.4};
    }
}
