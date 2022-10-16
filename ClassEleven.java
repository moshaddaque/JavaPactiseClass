import java.util.Scanner;

public class ClassEleven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int rows = sc.nextInt();
        // int cols = sc.nextInt();
        
        // int numbers[][] = new int[rows][cols];

        // for(int i =0; i < rows; i++){
        //     for(int j = 0; j < cols; j++){
        //         numbers[i][j] = sc.nextInt();
        //     }
        // }

        // int x = sc.nextInt();
        // for(int i =0; i < rows; i++){
        //     for(int j = 0; j < cols; j++){
        //         if(numbers[i][j] == x){
        //             System.out.print("x found at location (" + i + "," + j + ")");
        //         }
                
        //     }
        //     System.out.println();
        // }


        // Print spiral matrix as output for given matrix of numbers
        // int n = sc.nextInt();
        // int m = sc.nextInt();
        // int matrix[][] = new int[n][m];
        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j < m; j++){
        //         matrix[i][j] = sc.nextInt();
        //     }
        // }

        // System.out.println("The spiral Order matrix is: ");

        // int rowStart = 0;
        // int rowEnd = n - 1;
        // int colStart = 0;
        // int colEnd = m - 1;

        // while(rowStart <= rowEnd && colStart <= colEnd){
        //     //1
        //     for(int col = colStart; col <= colEnd; col++){
        //         System.out.print(matrix[rowStart][col] + " ");
        //     }
        //     rowStart++;
        //     //2
        //     for(int row = rowStart; row <= rowEnd; row++){
        //         System.out.print(matrix[row][colEnd] + " ");
        //     }
        //     colEnd--;
        //     //3
        //     for(int col = colEnd; col >= colStart; col--){
        //         System.out.print(matrix[rowEnd][col] + " ");
        //     }
        //     rowEnd--;
        //     //4
        //     for(int row = rowEnd; row >= rowStart; row--){
        //         System.out.print(matrix[row][colStart]);
        //     }
        //     colStart++;

        //     System.out.println();
        // }


        int n = sc.nextInt();
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("The Transpose is: ");

        for(int j = 0; j < m; j++){
            for(int i = 0; i < n; i++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}