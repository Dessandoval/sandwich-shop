package com.pluralsight;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double price = 0;

        // Prompt the user for the size of the sandwich (1 or 2):
        System.out.print("Select size of sandwich: (1 = regular or large = 2) ");
        int sandwichSize = scanner.nextInt();
        scanner.nextLine();

        //a. 1: Regular: base price $5.45
        //b. 2: Large: base price $8.95
        if (sandwichSize == 1){
            System.out.println(price = 5.45);
        } else if (sandwichSize == 2) {
            System.out.println(price = 8.95);
        }else
            System.out.println("Select sandwich size");


        //Prompt the user for their age:
        //a. Student (17 years old or younger) – receive a 10% discount
        //b. Seniors (65 years old or older) – receive a 20% discount
        //c. Everyone else won't receive a discount

        double discount = 0;

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age <= 17){
           discount = .10;
            System.out.print(price * discount);
        } else if (age >= 65) {
            discount = .20;
            System.out.print(price * discount);
        }else
            discount = 0;
        System.out.print(price);
    }

}
