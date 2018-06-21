package com.company;

public class Main {

    public static void main(String[] args) {
        byte size;
        size = (byte) args.length;
       /* if (size >=1){
            System.out.println(args[0]);
        } else{
            System.out.println("No input parameter");
        }*/

        for (int index = 0; index <size; index++){
            System.out.println(args[index]);
        }


    }
}
