import java.util.Scanner;

public class ClassFifteen {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();

        // Get Bit
        int n = 5; // bin= 0101
        // int pos = 2;
        // int bitMask = 1 << pos;

        // if((bitMask & n) == 0){
        //     System.out.println("bit was Zero");
        // }else{
        //     System.out.println("bit was one");
        // }

        // Set Bit
        // int pos =1;
        // int bitMask = 1 << pos;
        // int newNumber = bitMask | n;

        // System.out.println(newNumber);

        // if(newNumber == 0){
        //     System.out.println("this is zero");
        // } else{
        //     System.out.println("Set is done");
        // }

        //Clear Bit
        // int pos = 2;
        // int bitMask = 1<< pos;
        // int notBitMust = ~(bitMask);

        // int newNumber = notBitMust & n;

        // System.out.println(newNumber);


        //Update Bit
        int pos = 1;
        int bitMask = 1 << pos;

        if(oper == 1){
            //set
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else{
            int notBitMusk = ~(bitMask);
            int newNumber = notBitMusk & n;
            System.out.println(newNumber);
        }
    }
}
