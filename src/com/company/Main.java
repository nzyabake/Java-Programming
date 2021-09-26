package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("Are you eligible to attend this part?? ");
        System.out.println("How old are you?");

        //input
        int age = scan.nextInt();
        System.out.println();

        //Condition


        if (age >= 0 && age <= 17) {
            System.out.println("You are too young for the party, go and play somewhere else");
        } else if (age >= 18 && age <= 40) {
            System.out.println("You are eligible to attend the party, go and have fun!!!!");
        } else if (age >= 41 && age <= 100) {
            System.out.println("You are old, go and have some rest");
        } else {
            System.out.println("Invalid input");
        }
    }
}
