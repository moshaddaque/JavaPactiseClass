// Print the table of a number input by the users.
import java.util.Scanner;

public class NumberTable{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = input.nextInt();

        tableCalc(number);
    }
    private static void tableCalc(int num){
        for(int i = 1; i <= 10; i++){
            System.out.println(num + "*" + i + "=" + num * i);
        }
    }
}