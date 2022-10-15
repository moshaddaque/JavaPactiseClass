import java.util.Scanner;

public class practisePb {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // Upper Section
        for(int i = 1; i <= n; i++){
            // print star
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            // print space
            int space = 2* (n-i);
            for(int j = 1; j <= space; j++){
                System.out.print(" ");
            }
            // print star
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower Section

        for(int i = n; i >= 1; i--){
            // print star
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            // print space
            int space = 2* (n-i);
            for(int j = 1; j <= space; j++){
                System.out.print(" ");
            }
            // print star
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
     }

}
