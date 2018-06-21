package com.company;

public class Arrays {
    public static void main (String [] args){

        int[] numbers = new int[15];
            for (int i=0; i<numbers.length; i++){
            numbers[i]=i;
            System.out.println("numbers["+i+"] = " + numbers[i] );
        }
        String [] letters = new String[14];
            letters[0]="a";
            letters[1]="b";
        for (int i=0; i<letters.length; i++){
            System.out.println("letters["+i+"] = " + letters[i] );
        }
    }
}
