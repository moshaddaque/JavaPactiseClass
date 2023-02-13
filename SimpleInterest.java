// Write a program to input principal, time and rate from the user and find simple Interest..

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter principal amount: ");
        Double principal = input.nextDouble();
        System.out.println("Enter the Time period: ");
        int time = input.nextInt();
        System.out.println("Enter the Amount of Rate: ");
        Double rate = input.nextDouble();
        Double interest = (principal * time * rate)/100;
        System.out.println("Your Interest Amount: " + interest);
    }
}
