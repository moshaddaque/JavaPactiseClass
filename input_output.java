import java.util.Scanner;

public class input_output {
    public static void main(String[] args)
    {
        // System.out.println("Rectangle Area Calculator");

        // Scanner input = new Scanner(System.in);

        // System.out.println("What is the length of side A? ");
        // float sideA = input.nextFloat();

        // System.out.println("What is the length of side B?");
        // float sideB = input.nextFloat();

        // float area = sideA * sideB;

        // System.out.println("The area your Rectangle is: " + area);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 Numbers: ");
        Float a = sc.nextFloat();
        String c = sc.next();
        Float b = sc.nextFloat();
        

        calculate(a, b, c);


    }

    private static void calculate(Float a, Float b, String c){
        switch(c){
            case "+" : System.out.println(a + b);
            break;

            case "-" : System.out.println(a - b);
            break;
            
            case "*" : System.out.println(a * b);
            break;

            case "/" : System.out.println(a / b);
            break;

            case "%" : System.out.println(a % b);
            break;

            default: System.out.println("Enter valid data");
        }
    }
}
