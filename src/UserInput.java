import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) throws Exception {
   Scanner s1 = new Scanner(System.in);
   //String userName = s1.nextLine();
    System.out.println( "Enter your name: ");
    String userName = s1.nextLine();
    System.out.println("hello: " +userName);
    //ask the user for their favourite number and store it in an integer variable
    System.out.println("What is your favourite number?");
    int favNum = s1.nextInt();
    System.out.println("What is your GPA?");
    double gpa = s1.nextDouble();
    System.out.println("Your favourite number is: " + favNum);
    System.out.println("Your GPA is: " + gpa);
    System.out.println("Is that correct? (yes/no)");
    if (s1.next().equalsIgnoreCase("yes")) {
        System.out.println("Fantastic! Thank you for your input.");
    } else { 
            System.out.println("Ruh roh...");
    }
    s1.nextLine(); //consumes the leftover white space
    
    System.out.println("What is your favourite word?");
    String favWord = s1.nextLine();
    System.out.println("Your favourite word is: " + favWord);
    }
}
