// Class Three

import java.util.Scanner;


public class ClassThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();

        // if(age >= 18){
        //     System.out.println("Adult");
        // } else {
        //     System.out.println("Not Adult");
        // }


        

        // System.out.print("Please Inter a Number: ");
        // int x = sc.nextInt();

        // if(x % 2 == 0){
        //     System.out.println("Even");
        // } else {
        //     System.out.println("Odd");
        // }


        // System.out.print("X = ");
        // int x = sc.nextInt();
        // System.out.print("Y = ");
        // int y = sc.nextInt();

        // if(x == y){
        //     System.out.println("x is Equal to y");
        // }else if (x > y){
        //     System.out.println("x is Greater than y");
        // } else {
        //     System.out.println("x is Less than y");
        // }



        // System.out.print("Enter your Name: ");
        // String name = sc.nextLine();
        // System.out.print("Enter Your Father's Name: ");
        // String fatherName = sc.nextLine();
        // System.out.print("Enter Your Mother's Name: ");
        // String motherName = sc.nextLine();

        // System.out.print("Enter Your Age: ");
        // int age = sc.nextInt();
        // System.out.print("Enter Your Total Family Members: ");
        // int familyMembers = sc.nextInt();
        
        

        // System.out.println("I am "+ name +". My age is "+ age +"." + "My Father's name is " + fatherName + ". My Mother's name is "+ motherName + ". There are "+ familyMembers + " members in my family. I Love my family very much.");



        int button = sc.nextInt();

        switch(button){
            case 1: System.out.println("Hi!! This is number 1 switch");
                        break;
            case 2: System.out.println("Hello!! This is number 2 switch");
                        break;
            case 3: System.out.println("hmm.. This is number 3 switch");
                        break;
            default: System.out.println("This is default switch..");
        }
        
    }
}
