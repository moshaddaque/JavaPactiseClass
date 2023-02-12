import java.util.Scanner;

public class input_output {
    public static void main(String[] args)
    {
        System.out.println("Rectangle Area Calculator");

        Scanner input = new Scanner(System.in);

        System.out.println("What is the length of side A? ");
        float sideA = input.nextFloat();

        System.out.println("What is the length of side B?");
        float sideB = input.nextFloat();

        float area = sideA * sideB;

        System.out.println("The area your Rectangle is: " + area);
    }
}
