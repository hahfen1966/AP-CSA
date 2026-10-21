package ClaudePractices;

import java.util.Scanner;

public class NameTag {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Please enter your first name followed by a space, and then your last name.");
        String fullName = s1.nextLine();

        String firstName = fullName.substring(0, fullName.indexOf(" "));
        String lastName = fullName.substring(fullName.indexOf(" ") + 1);
        String firstInit = fullName.substring(0,1);
        String lastInit = lastName.substring(0, 1);
        int length = fullName.length() - 1;
        String userName = (firstInit + lastName + ((int) ((Math.random() * 90) + 10) + (int) ((Math.random() * 90 + 10))));

        System.out.println(lastName + ", " + firstName);
        System.out.println(firstInit + lastInit);
        System.out.println("There are " + length + " letters in your name.");
        System.out.println(userName);



    }

}
