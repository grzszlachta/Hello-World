package com.company;

public class Clients {
    public static void main(String[] args) {

        int clientNumber = 10;
        int[] age = new int [clientNumber];
        boolean [] isRegular = new boolean[clientNumber];
        String [] email = new String[clientNumber];
        String [] name = new String [clientNumber];
        String [] surname = new String[clientNumber];
        String [] phone = new String[clientNumber];
        //clinet1
        age [0] = 29;
        isRegular[0] = false;
        email [0] = "a@gmail.com";
        name [0] = "Imie1";
        surname[0] = "Nazwisko1";
        phone [0] = "0128321782";

        String [] regularClientEmails = new String[clientNumber];
        for (int i=0; i<clientNumber; i++){
            if (isRegular[i]){
                regularClientEmails[i] = email[i];
            }
        }
        for (int i=0; i<clientNumber; i++){
            if (regularClientEmails !=null){
                System.out.println(regularClientEmails[i]);
            }
        }


    }
}
