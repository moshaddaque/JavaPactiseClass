public class Recursion {

    // // print numbers from 5 to 1
    // public static void printNumbers(int n){

    //     if(n == 0) // base case
    //         return;

    //     System.out.println(n); // print

    //     printNumbers(n - 1); // recursive
    // }

    // //-print numbers from 1 to 5
    // public static void printNumbers(int n){

    //     if(n == 6) // base
    //         return;

    //     System.out.println(n); // print
    //     printNumbers(n + 1); // recursive
    // }

    // // print sum of first n natural numbers 
    // public static void printSum(int i, int n, int sum){

    //     if(i == n){ // base
    //         sum += i;
    //         System.out.println(sum);
    //         return;
    //     }

    //     sum += i;  // work
    //     printSum(i+1, n, sum); // recursive
    // }

    // print factorial of a number n
    // public static int calcFactorial(int n){

    //     if(n == 1 | n == 0)
    //         return 1;

    //     int fac_1 = calcFactorial(n - 1);
    //     int fact_n = n * fac_1;
    //     return fact_n;
    // }

    // // print the Fibonacci sequence till nth term
    // public static void printFib(int a, int b, int n){

    //     if(n == 0)
    //         return;
    //     int c = a + b;
    //     System.out.print(c + " ");
    //     printFib(b, c, n-1);
    // }

    // // print x^n (stack heigh = n)
    // public static int calcPower(int x, int n){

    //     if (n == 0)
    //         return 1;
 
    //     // If we need to find of 0^y
    //     if (x == 0)
    //         return 0;
 
    //     // For all other cases
    //     int xPownm = calcPower(x, n - 1);
    //     int xPown = x * xPownm;
    //     return xPown;
    // }

    // print x^n (stack heigh = logn)
    public static int calcPower(int x, int n){

        if (n == 0)
            return 1;
 
        // If we need to find of 0^y
        if (x == 0)
            return 0;
        // if n is even
        if(n % 2 == 0){
            return calcPower(x, n / 2) * calcPower(x, n / 2);
        } 
        // if n is odd
        else{
            return calcPower(x, n / 2) * calcPower(x, n / 2) * x;
        }
    }

    public static void main(String[] args) {
        
        // printSum(1, 10, 0); // call

        int n = 5;
        // int ans = calcFactorial(n);
        // System.out.println(ans);


        // int a = 0, b = 1;

        // System.out.print(a + " ");
        // System.out.print(b + " ");
        // printFib(a, b, n - 2);

        int x = 2; 
        int ans = calcPower(x, n);
        System.out.println(ans);

    }
}
