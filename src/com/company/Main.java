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


        //Switch case
        int year = (20);
        switch (year) {
            case 20 -> System.out.println("Happy 20th birthday");
            case 21 -> System.out.println("You are beyond 20");
            default -> System.out.println("Invalid input");
        }

        ///Enhanced for loop
        String array[] = {"Computing", "Informatics", "Cybersecurity"};

        for (String x:array)
        {
            System.out.println(x);
        }

        //for loop

        for (int number = (1); number <= 10; number = number +2)
        {
            System.out.println(number);
        }

        //While loops

        int val = (2);
        do {
            System.out.println(val);
            val++;
        }
        while (val < 10);
    }
}
