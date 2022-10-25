import java.util.Scanner;

public class practisePb {

    // for print
    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int n = sc.nextInt();

        // // Upper Section
        // for(int i = 1; i <= n; i++){
        //     // print star
        //     for(int j = 1; j <= i; j++){
        //         System.out.print("*");
        //     }
        //     // print space
        //     int space = 2* (n-i);
        //     for(int j = 1; j <= space; j++){
        //         System.out.print(" ");
        //     }
        //     // print star
        //     for(int j = 1; j <= i; j++){
        //         System.out.print("*");
        //     }

        //     System.out.println();
        // }

        // // Lower Section

        // for(int i = n; i >= 1; i--){
        //     // print star
        //     for(int j = 1; j <= i; j++){
        //         System.out.print("*");
        //     }
        //     // print space
        //     int space = 2* (n-i);
        //     for(int j = 1; j <= space; j++){
        //         System.out.print(" ");
        //     }
        //     // print star
        //     for(int j = 1; j <= i; j++){
        //         System.out.print("*");
        //     }

        //     System.out.println();
        // }


        // int arrSize = sc.nextInt();
        // int arr[] = new int[arrSize];
        
        // for(int i = 0; i < arrSize; i++){
        //     arr[i] = sc.nextInt();
        // }
        
        // for(int i =0; i < arr.length-1; i++){
        //     for(int j = 0; j < arr.length - i - 1; j++){
        //         if(arr[j] > arr[j +1]){
        //             //swap
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        // }
        // // print
        // printArray(arr);

        int n = sc.nextInt();

        if(n % 2 == 0){
            for(int i = 2; i <= n; i = i +2){
                System.out.println(i);
            }
        } else{
            for(int i = 2; i <= n -1; i = i + 2){
                System.out.println(i);
            }
        }
     }

}
