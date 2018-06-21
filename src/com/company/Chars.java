package com.company;

public class Chars {
    public static void main(String[] args) {
        String input ="atest";
        char [] chars = input.toCharArray();
        for (int i=0; i<chars.length;i++){
            System.out.println(chars[i] + "->" + (chars[i]-'a') );
        }
    }
}
