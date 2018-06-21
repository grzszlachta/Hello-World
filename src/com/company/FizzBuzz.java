package com.company;

public class FizzBuzz {
    public static void main(String[] args) {

        /*for (int i=0; i<100; i++){

            if(i%3==0 && i%5!==0){
                System.out.println("Fizz");
            }
            if(i%3!==0 && i%5==0){
                System.out.println("Buzz");
            }
            if (i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }
            if (i%3!==0&& i%5!==0){
                System.out.println(i);
            }*/
        for (int i=1;i<101; i++){
            if (i%3 == 0){
                if(i%5==0){
                    System.out.print("FizzBuzz ");
                    continue;
                } else {
                    System.out.print("Fizz ");
                    continue;
                }
            }
            if (i%5==0){
                System.out.print("Buzz ");
                continue;
            }
            System.out.print(i + " ");

        }
    }
}
