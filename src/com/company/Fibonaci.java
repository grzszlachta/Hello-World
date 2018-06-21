package com.company;

import java.util.Scanner;

public class Fibonaci {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        Scanner read = new Scanner (System.in);
        System.out.println("Which Fibonacci number you want? ");
        int numb=read.nextInt();
        int fib=-1;
        for (int i=0;i<numb-1;i++){
            fib=a+b;
            a=b;
            b=fib;

        }
        System.out.println(numb + "th Fibonacci number is: " + fib);
    }
}
