
import java.util.Scanner;

public class ClassFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // for(int counter = 1; counter < 101; counter++){
        //     System.out.println("Hi!! This is loop " + counter);
        // }


        // int i = 0;
        // while(i <11){
        //     System.out.println("This is while loop..." + i);
        //     i++;
        // }


        // int i = 0;
        // do{
        //     System.out.println("This is do while loop" + i);
        //     i++;
        // } while(i < 11);



        // print sum of n natural number
        // int n = sc.nextInt();
        // int sum = 0;
        // for(int i = 1; i <= n; i++){
        //     sum = sum + i;
        // }
        // System.out.println(sum);

        // print table of n numbers

        // int n = sc.nextInt();
        // for(int i = 1; i < 11; i++){
        //     System.out.println(n + " * " + i + " = " + n * i);
        // }


        // Print all even numbers till n and sum of them.

        // int sum = 0;
        // int n = sc.nextInt();
        // for(int i = 0; i <= n; i++){
        //     if (i % 2 == 0){
        //         System.out.println(i);
        //         sum = sum + i;
        //     }
        // }
        // System.out.println(sum);


        // System.out.println("Enter Number of this menu:");
        // System.out.println("If yes, Please enter 1 or If no, Enter 0");

        // int menu = sc.nextInt();

        // if (menu == 1){
        //     System.out.print("Input Student's marks: ");
        //     int marks = sc.nextInt();

        //     if (marks >= 90){
        //         System.out.println("This is Good");
        //     } else if (89 >= marks && marks >= 60){
        //         System.out.println("This is also Good");
        //     } else {
        //         System.out.println("This is Good as well");
        //     }
        // } else{
        //     System.out.println("Thanks");
        // }



        boolean flag = false;
        int n = sc.nextInt();
            for (int i = 2; i <= n / 2; ++i){
                if(n % i == 0){
                    flag = true;
                    break;
                }
            }
            if (!flag){
                System.out.println(n + " is Prime Number");
            } else {
                System.out.println(n + " is Non prime Number");
            }
       



    }
}
