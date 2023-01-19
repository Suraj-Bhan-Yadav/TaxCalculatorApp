package com.internshala.javaapp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Tax  Calculator  App \n -------WELCOME------");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the total person count:");
        int num = scanner.nextInt();

        int[] arrayNum = new int[num];
        String[] personName = new String[arrayNum.length];

        Long[] personIncome = new Long[arrayNum.length];

        for(int i = 0;i< arrayNum.length;i++) {
            int j=i+1;
            System.out.println("Enter name "+j+":");
            personName[i] = scanner.next();

            System.out.println("Enter " + personName[i] + "'s Annual Income");
            personIncome[i] = scanner.nextLong();
        }
        System.out.println("Name with liable tax");
        System.out.println("---------------------");
        for(int i = 0;i<arrayNum.length;i++){
           calculateTax(personName[i],personIncome[i]);
        }
        scanner.close();

    }

    public static double calculateTax(String personName, Long personIncome){
        double tax;
        if(personIncome>=300000) {
            tax = personIncome * 0.2;
        }
        else if(personIncome>=100000 && personIncome<300000){
            tax = personIncome*0.1;
        }
        else{
            tax = 0;
        }
        System.out.println(personName+":\u20B9 "+ tax);
        return tax;

    }
}
