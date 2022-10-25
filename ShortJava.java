import java.util.Scanner;

public class ShortJava {
    // Output
    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        int arr[] = new int [arraySize];

        //input
        for(int i = 0; i < arraySize; i++){
           arr[i] = sc.nextInt();
        }

        // Bubble short
        // for(int i = 0; i < arr.length - 1; i++){
        //     for(int j = 0; j < arr.length - i - 1; j++){
        //         if(arr[j] > arr[j + 1]){
        //             // swap
        //             int temp = arr[j];
        //             arr[j] = arr[j + 1];
        //             arr[j + 1] = temp;
        //         }    
        //     }
        // }

        // Selection Short
        // for (int i = 0; i < arr.length -1; i++){
        //     int smallest = i;
        //     for(int j = i +1; j < arr.length; j++){
        //         if(arr[smallest] > arr[j]){
        //             smallest = j;
        //         }
        //     }
        //     int temp = arr[smallest];
        //     arr[smallest] = arr[i];
        //     arr[i] = temp;
        // }

        //insertion Sort
        for(int i = 1; i < arr.length; i++){
            int current = arr[i];
            int j = i -1 ;
            while(j >= 0 && arr[j] > current){
                arr[j + 1] = arr[j];
                j--;
            }
            //placement
            arr[j+1] = current;
        }






        // Output
        printArray(arr);
    }
}
