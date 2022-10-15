// Class Two + One

import java.util.Scanner;

public class ClassTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int a = sc.nextInt();
        int b = sc.nextInt();
        double c = sc.nextDouble();
        int sum = (a + b) ;

        System.out.println(name);
        System.out.println(sum);
        System.out.println(c);
        
    }
}