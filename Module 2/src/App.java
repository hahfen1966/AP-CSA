import java.util.Scanner;

public class App {

//in for loops, we start with i = to a starting condition, then we write the condition in which the for loop 
//repeats for as long as it is true, then the increment of the loop.
public static String reverseOrder(String str){
     String result = "";
    for(int i = str.length() - 1; i >= 0; i--){
        result += str.substring(i, i +1);
    }
    return result;
        
    }

public static String replace(String string, String replace, String add){
    String corrected = "";
    for(int i = 0; i <string.length(); i++){
        if(string.substring(i,i+1).equals(replace)){
            corrected += add;
    }
    else{
        corrected += string.substring(i,i+1);
    }
    }
    return corrected;

}
public static void oneAtATime(String a){
    int length = a.length();
    for(int i = 0; i < length; i++){
        System.out.println(a.substring(i, i+1));}
}
public static void main(String[] args) throws Exception {
   System.out.println(reverseOrder("hello"));


 //oneAtATime("hello");
    replace("hello", "e", "r");
    for(int i = 100; i >= 1; i--){
        System.out.println(i);
    }
    System.out.println("Countdown Complete.");

    for(int i = 1; i <= 11; i++){
        for(int j = 1; j <= 11; j++){
            System.out.println(i * j + " ");
        }
        System.out.println();
    }

    Rectangle r1 = new Rectangle();
    Rectangle r2 = new Rectangle();
    r1.equals(r2);

    Rectangle.getArea(r1);
    r1.getArea();

    r1.greaterArea(r2);

/* for(int i = 0; i <= 50; i = i + 2){
        System.out.println(i);
    }

    String a = "Hello";

    Scanner s1 = new Scanner(System.in);

    String password2 = "Jellybeans";
    System.out.println("Enter the password.");
    String userAttempt = s1.nextLine();
    while(!userAttempt.equals(password2)){
        System.out.println("Incorrect. Try again.");
        userAttempt = s1.nextLine();
    }

    System.out.println("Access Granted.");
    
    /*OR 
    while(true){
    System.out.println("Enter the correct password.");
    String userAttempt = s1.nextLine();
    if(userAttempt.equals(password2)){
        break;
    }}
    */



    for(int i = 0; i < a.length() -1; i++){
    
    System.out.println(a.substring(i,i+1));}




    /*int x = 0;
    while(x <= 100)
    {
        System.out.println(x);
        x+=5; //same as x = x + 5; 
    }

    for(int x = 0; x <=100; x+=5)
    {
        System.out.println(x);
    }

    String password = "";
    while(password.length < 8)
    {
        password+= "a";
    }
    System.out.println(password)
































/*System.out.println("Hello, World!");

        Cookie c1 = new Cookie(1200, "Minecraft", true, 1.0);
        Cookie c2 = new Cookie(1200, "Minecraft", true, 1.0);
        Cookie c3 = new Cookie();

        if (c)
        //System.out.println(c1.equals(c2));

      

 /* String s1 = "hello";
String s2 = "hello";
//System.out.println(s1 == s2);
System.out.println(s1.equals(s2));
 */
    }
}
