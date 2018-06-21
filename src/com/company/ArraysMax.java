package com.company;
import java.util.Scanner;
public class ArraysMax {
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        System.out.println("Please give expected count of numbers: " );
        int length= read.nextInt();
        int[] numbers = new int [length];
        for (int i=0; i<numbers.length; i++){
            System.out.println("Please give " + (i+1) + " number: ");
            numbers [i] = read.nextInt();
        }
        int position =0;
        int max = numbers [position];
        for (int i=1; i<numbers.length; i++){
            if (max <numbers[i]){
                max=numbers[i];
                position = i;
            }
        }

    }
}
