package com.pluralsight;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sandwichSize = 1;
        boolean isRegular = false;
        boolean isLarge = true;
        double price = 0;

        // Prompt the user for the size of the sandwich (1 or 2):
        System.out.println("Select size of sandwich: (1 = regular or large = 2) ");
        int foodOrder = scanner.nextInt();



        //a. 1: Regular: base price $5.45

        //b. 2: Large: base price $8.95


        //Prompt the user for their age:
        //a. Student (17 years old or younger) – receive a 10% discount
        //b. Seniors (65 years old or older) – receive a 20% discount
        //c. Everyone else won't receive a discount
    }
}
