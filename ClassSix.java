import java.util.Scanner;

public class ClassSix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

                // Butterfly  Pattern
        // Upper Part
        
        // for(int i = 1; i <= n; i++){
        //  // star print
        //     for(int j = 1; j <= i; j++){
        //         System.out.print("*");
        //     }
        // //space print
        //     int space = 2 * (n-i);
        //     for(int j = 1; j <= space; j++){
        //          System.out.print(" ");
        //     }
        // // Star Print
        //     for(int j = 1; j<= i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // // Lower part

        // for(int i = n; i >= 1; i--){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print("*");
        //     }
        // //space print
        //     int space = 2 * (n-i);
        //     for(int j = 1; j <= space; j++){
        //          System.out.print(" ");
        //     }
        // // Star Print
        //     for(int j = 1; j<= i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    


        // Solid Rhombus

        // for(int i = 1; i <= n; i++){
        //     // print space
        //     int space = (n - i);
        //     for(int j = 1; j <= space; j++){
        //         System.out.print(" ");
        //     }

        //     for(int j = 1; j <= n; j++){
        //         System.out.print("*");
        //     }

        //     System.out.println();
        // }


        // Number Piramid

        // for(int i = 1; i <= n; i++){
        //     // Print Space
        //     int space = (n - i);
        //     for(int j = 1; j <= space; j++){
        //         System.out.print(" ");
        //     }

        //     // print numbers
        //     for(int j = 1; j <= i; j++){
        //         System.out.print(i + " ");
        //     }

        //     System.out.println();
        // }


        // for(int i = 1; i <= n; i++){
        //     //space
        //     int space = (n - i);
        //     for(int j = 1; j <= space; j++){
        //         System.out.print(" ");
        //     }
        //     //numbers
        //     for(int j= i; j >= 1; j--){
        //         System.out.print(j);
        //     }
        //     for(int j= 2; j <= i; j++){
        //         System.out.print(j);
        //     }

        //     System.out.println();
        // }

        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= n-i; j++){
        //         System.out.print(" ");
        //     }

        //     int star = 2 * (i - 1);
        //     for(int j = 0; j <= star; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for(int i = n; i >= 1; i--){
        //     for(int j = 1; j <= n-i; j++){
        //         System.out.print(" ");
        //     }

        //     int star = 2 * (i - 1);
        //     for(int j = 0; j <= star; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        //  Hollow Butterfly

        // for(int i = 1; i <= n; i++){
        //     // star border
        //     for(int j = 1; j <= i; j++){
        //         if(j == i || j == 1 || i == 1){
        //             System.out.print("*"); 
        //         } else {
        //             System.out.print(" "); 
        //         }  
        //     }
        //     // Space
        //     int space = 2 * (n - i);
        //     for(int j = 1; j <= space; j++){
        //         System.out.print(" ");
        //     }
        //     // star
        //     for(int j = 1; j <= i; j++){
        //         if(j == i || j == 1 || i == 1){
        //             System.out.print("*"); 
        //         } else {
        //             System.out.print(" "); 
        //         }  
        //     }
        //     System.out.println();
        // }

        // // Lower
        // for(int i = n; i >= 1; i--){
        //     // star border
        //     for(int j = 1; j <= i; j++){
        //         if(j == i || j == 1 || i == 1){
        //             System.out.print("*"); 
        //         } else {
        //             System.out.print(" "); 
        //         }  
        //     }
        //     // Space
        //     int space = 2 * (n - i);
        //     for(int j = 1; j <= space; j++){
        //         System.out.print(" ");
        //     }
        //     // star
        //     for(int j = 1; j <= i; j++){
        //         if(j == i || j == 1 || i == 1){
        //             System.out.print("*"); 
        //         } else {
        //             System.out.print(" "); 
        //         }  
        //     }
        //     System.out.println();
        // }



        // Hollow Rhombus

    // for(int i= 1; i <= n; i++){
    //     for(int j = 1; j <= n-i; j++){
    //         System.out.print(" ");
    //     }
    //     for(int j = 1; j <= n; j++){
    //         if(i == 1 || i == n || j == 1 || j == n){
    //             System.out.print("* ");
    //         } else{
    //             System.out.print("  ");
    //         }
    //     }
    //     System.out.println();
    // }


        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= n-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 1; j <= i; j++ ){
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }

        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= n-i; j++){
        //         System.out.print(i);
        //     }
        //     System.out.println();
        // }


        for(int i = 1; i <= n; i++){

            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
             }

            int c = 1;
            for(int j = 1; j <= i; j++){
                System.out.print(c + " " );
                c= c * (i - j) / j;
            }

            System.out.println();
        }

    }
}
