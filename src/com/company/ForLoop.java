package com.company;
import java.util.Scanner;

public class ForLoop {

    public static void main (String[] args){
        Scanner read = new Scanner(System.in);
        System.out.println("Give me a count of expected numbers: ");
        int count = read.nextInt();
        int sum=0;

        for (int index = 0; index <count; index++){
            System.out.println("Please give " + index + " number");
            sum = sum + read.nextInt();
            System.out.println("sum = "+ sum);
        }
        System.out.println("Final sum is: " + sum);
        float average = (float)sum/count;
        System.out.println("average = " + average);
    }
}