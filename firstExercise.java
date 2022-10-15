import java.util.Scanner;

public class firstExercise {

//--------------------------------------------------------------------- 1
    // Average
    // public static double printAverage(float a, float b, float c){
    //     double avg = (a + b + c) / 3.00;

    //     return avg;
    // }
//------------------------------------------------------------------------ 2
    // Sum of all Odd numbers from 1 to n
    // public static void printSum(int n){
    //     int sum = 0;
    //     for(int i = 1; i <= n; i++){
    //         if(i % 2 == 1){
    //             sum = sum + i;
    //         }
    //     }
    //     System.out.println(sum);
    // }
//-------------------------------------------------------------------------- 3

    // public static void printGreater(int a, int b){
    //     if(a > b){
    //         System.out.println(a + " is greater");
    //     } else{
    //         System.out.println(b + " is greater");
    //     }
    // }
//-------------------------------------------------------------------------- 4

    // Circumference of a circle
    // public static void printCirCircle(float rad){
    //     double pi = 3.1416;
    //     double cir = 2.0 * rad * pi;
    //     System.out.println(cir);
    // }
//-------------------------------------------------------------------------- 5

    // Eligible to vot or not
    // public static void printVoter(int age){
    //     if(age > 18){
    //         System.out.println("You are eligible");
    //     } else{
    //         System.out.println("You are not eligible");
    //     }
    // }
//------------------------------------------------------------------------- 6

    // An infinite loop
    // public static void printInfinite(){
    //     int i = 0;
    //     do{
    //         System.out.println("mizan ");
    //         i++;
    //     } while( i > 0);
    // }
//------------------------------------------------------------------------- 7

    // public static void printCount(int num){
    //     Scanner sc = new Scanner(System.in);
    //     char opt = 'y';
    //     int counter = 0, nve = 0, pve = 0, zero = 0;
    //     while(opt == 'Y' || opt == 'y'){
    //         ++ counter;
    //         System.out.println("Enter the number:");
    //         num = sc.nextInt();
    //         if(num == 0){
    //             ++zero;
    //         } else if(num < 0){
    //             ++nve;
    //         } else if(num > 0){
    //             ++pve;
    //         }
    //         System.out.println("Enter 'Y' if you wish to continue else enter 'N'!"); 
    //         opt=sc.next().charAt(0);
    //     }

    //     System.out.println("Total Number Of Entries: "+counter); 
    //     System.out.println("Negative Entries: "+nve); 
    //     System.out.println("Positive Entries: "+pve); 
    //     System.out.println("Zero Entries: "+zero); 
    //     sc.close(); 
    //     return;
    // }
//------------------------------------------------------------------------- 8

// public static int power(int base, int exponent){
//     int power = 1;
//     for(int i = 1; i <= exponent; i++){
//         power = power * base;
//     }
//     return power;
// }
//------------------------------------------------------------------------- 9
    public static int gcd(int a, int b){
        int i;
        if(a > b){
            i = a;
        } else{
            i = b;
        }

        for( i = i; i > 1; i--){
            if(a % i == 0 && b % i == 0){
                return i;
            }
        }

        return 1;
    }


//------------------------------------------------------------------------- 10

    // Fibonacci
    // public static void printFibonacci(int n){
    //     int a = 0, b = 1;
    //     System.out.print(a +"" + b);
    //     for(int i = a+b; i <= n; i++){
    //         System.out.print(i);
    //         a = b;
    //         b = i;
    //     }
    //     return;
    // }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    //--------------------------------------------------------------------- 1
         // Average
        // float a = sc.nextFloat();
        // float b = sc.nextFloat();
        // float c = sc.nextFloat();

        // System.out.println(printAverage(a, b, c));
     //----------------------------------------------------------------------- 2
        // Sum of all Odd numbers from 1 to n
        // int n = sc.nextInt();
        // printSum(n);

    //--------------------------------------------------------------------- 3
        // int x = sc.nextInt();
        // int y = sc.nextInt();

        // printGreater(x, y);

    //--------------------------------------------------------------------- 4
      
    // Circumference of a circle
        // float rad = sc.nextFloat();

        // printCirCircle(rad);

    //--------------------------------------------------------------------- 5

    // Eligible to vot or not
         // int age = sc.nextInt();

        // printVoter(age);

    //--------------------------------------------------------------------- 6

    // An infinite loop
    
         // printInfinite();
    
    //--------------------------------------------------------------------- 7


        // int n = 0;
        // printCount(n);
        
    //--------------------------------------------------------------------- 8
    // System.out.print("Enter the base Value: ");
    // int base = sc.nextInt();
    // System.out.print("Enter the exponent Value: ");
    // int exponent = sc.nextInt();

    // int pow = power(base, exponent);
    // System.out.println(base +" to the power " +exponent + " is: "+pow);


    //--------------------------------------------------------------------- 9

    System.out.print("Enter Two NUmbers: ");
    int a = sc.nextInt();
    int b = sc.nextInt();

    int gcd = gcd(a, b);

    System.out.println("GCD = " + gcd);


    //--------------------------------------------------------------------- 10

    // Fibonacci
        // int n = sc.nextInt();

        // printFibonacci(n);




    }
}
