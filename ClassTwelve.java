import java.util.Scanner;

public class ClassTwelve {
    public static void main(String[] args) {
        //String Class
        Scanner sc = new Scanner(System.in);

        // String name = sc.nextLine();
        // System.out.println("Your name is " + name); // concatenation
        // System.out.println(name.length()); // length Function 
        // // charAt
        // for(int i = 0; i < name.length(); i++){
        //     System.out.println(name.charAt(i));
        // }


        // Compare
    //     String name1 = sc.next();
    //     String name2 = sc.next();

    //     // 1. s1 > s2 : +ve value
    //     // 2. s1 == s2 : 0
    //     // 3. s1 < s2 : -ve value

    //    if(name1.compareTo(name2) == 0){
    //     System.out.println("Both are same.");
    //    } else{
    //     System.out.println("Both are not same.");
    //    }


       // shorting any part

    //    String sentence = "My Name is Mizan";
    //    String name = sentence.substring(11, sentence.length());
    //    System.out.println(name);

    // Take an Array of strings input from the user & find the comulative(combined) length of all those string
        // int size = sc.nextInt();

        // String array[] = new String[size];
        // int totLength = 0;

        // for(int i = 0; i< size; i++){
        //     array[i] = sc.next();
        //     totLength += array[i].length();
        // }
        // System.out.println(totLength);

    // Input a string from user. create a new string called 'result' in which you will replace the letter 'e' in the original string with letter 'i'.

        // String str = sc.next();
        // String result = "";

        // for(int i = 0 ; i < str.length(); i++){
        //     if(str.charAt(i) == 'e'){
        //         result += 'i';
        //     } else{
        //         result += str.charAt(i);
        //     }
        // }
        // System.out.println(result);

    // input an email from the user. you have to create a username from the email by deleting the part that comes after '@'. Display that user name to the user.
    // like: email: mizanhoshain@gmail.com
    //       username: mizanhoshain 

        System.out.print("Enter Your Email: ");
        String email = sc.next();
        // user name
        String userName = "";
        
        System.out.print("Enter Your Password: ");
        String password = sc.next();

        for(int i = 0; i < password.length(); i++){
            if(password.length() >= 8){
                break;
            } else{
                System.out.print("Enter Your Pass(8): ");
                password = sc.next();
                
            }
        }
        for(int i = 0; i < email.length(); i++){
            if(email.charAt(i) == '@'){
                break;
            }
            else{
                userName += email.charAt(i);
            }
        }



        // Output
        System.out.println();
        System.out.println();
        System.out.println("*******************************");
        System.out.println("Your Email: " + email);
        System.out.println("Your User Name: " + userName);
        System.out.print("Your Password: ");
        for(int i = 0; i < password.length(); i++){
            System.out.print("*");
        }
        System.out.println();
        System.out.println();
        System.out.println("*******************************");

    }
}
