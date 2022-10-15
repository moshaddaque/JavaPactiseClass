import java.util.Scanner;

public class ClassSeven {

    // No return value --> Void
    // public static void printName(String name){
    //     System.out.println(name);
    //     return;
    // }


    // public static int printSum(int a, int b){
    //     int sum = a + b;
    //     return sum;
    // }

    // public static int printMultiply(int a, int b){
    //     int mul = a * b;
    //     return mul;
    // }


    // factorial
    public static void printFact(int n){
        if(n < 0){
            System.out.println("Invalid number");
            return;
    }
        int factorial = 1;
        for(int i= n; i >= 1; i--){
            factorial = factorial * i;
        }

        System.out.println(factorial);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // printName(name);


        // int a = sc.nextInt();
        // int b = sc.nextInt();

        //int total = printSum(a, b);

        // System.out.println(total);
        // System.out.println(printSum(a, b));

        // int mul = printMultiply(a, b);
        // System.out.println(mul);

        int n= sc.nextInt();

        printFact(n);

    }
}
