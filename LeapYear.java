// Check Whether or Not the Year is a Leap Year in JAVA

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Year: ");
        int year = input.nextInt();
        leapYear(year);
    }
    private static void leapYear(int year){
        if(year % 400 == 0)
            System.out.println(year + " is Leap Year");
        else if(year % 4 == 0 && year % 100 != 0)   
            System.out.println(year + " is Leap Year");
        else
            System.out.println(year + " is not a Leap Year");
    }
}
