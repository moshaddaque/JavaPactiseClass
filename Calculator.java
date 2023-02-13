// Simple Calculator Using Java

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Numbers: ");
        double a = sc.nextDouble();
        String c = sc.next();
        double b = sc.nextDouble();
        System.out.print("The Ans is:");

        calc(a,b,c);
    }
    public static void calc(double a, double b, String c){
            switch(c){
                case "+" : 
                    System.out.println(a + b);
                    break;
                case "-" : 
                    System.out.println(a - b);
                    break;
                case "*" : 
                    System.out.println(a * b);
                    break;
                case "/" : 
                    System.out.println(a / b);
                    break;
                case "%" : 
                    System.out.println(a % b);
                    break;
                default:
                System.out.println("Invalid Input");
            }
    }
}
