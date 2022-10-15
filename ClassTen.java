import java.util.Scanner;

public class ClassTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // -------------------------------------------------------------------
        // System.out.print("Enter total subjects: ");
        // int size = sc.nextInt();
        // String names[] = new String[size];
        // int numbers[] = new int[size];

        // // input 
        // for(int i = 0; i < size; i++){
        //     System.out.print("Enter subject & marks: ");
        //     names[i] = sc.next(); 
        //     numbers[i] = sc.nextInt();
        // }

        // //output
        // for(int i = 0; i < numbers.length; i++){
            
        //     System.out.println("The marks of " + names[i] + " are " + numbers[i]);
        // }

     // -------------------------------------------------------------------


    //     int size = sc.nextInt();
    //     int numbers[] = new int[size];

    //  // input
    //     for(int i = 0; i < size; i++){
    //         numbers[i] = sc.nextInt();
    //     }
    // // Calculation
    //     int max = Integer.MIN_VALUE;
    //     int min = Integer.MAX_VALUE;

    //     for(int i = 0; i < numbers.length; i++){
    //         if(numbers[i] < min){
    //             min = numbers[i];
    //         }
    //         if(numbers[i] > max){
    //             max = numbers[i];
    //         }   
    //     }
    // // Output
    //     System.out.println("Largest Number is " + max);
    //     System.out.println("Smallest Number is " + min);


     // -------------------------------------------------------------------


        int size = sc.nextInt();
        int numbers[] = new int[size];

        //input
        for(int i = 0; i < size; i++){
            numbers[i] = sc.nextInt();
        }
        // Calculation
        boolean isAscending = true;

        for(int i = 0; i < numbers.length - 1; i++){
            if(numbers[i] > numbers[i + 1]){  
                isAscending = false;
            }
        }
        // output
        if(isAscending){
            System.out.println("The array is sorted in ascending order");
        } else {
            System.out.println("The array is not sorted in ascending order");
        }

        
    }
}
