import java.util.Scanner;

public class CodingAssignment1b {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Please give me a name");
        String name = s1.nextLine();
        System.out.println("Please give me a verb");
        String verb = s1.nextLine();
        System.out.println("Please give me an adjective");
        String adjective = s1.nextLine();
        System.out.println("Please give me another noun");
        String noun2 = s1.nextLine();
        System.out.println("Please give me another verb");
        String verb2 = s1.nextLine();
        System.out.println("Please give me another adjective");
        String adjective2 = s1.nextLine();
        
        System.out.println("Once upon a time, there was a prince named " + name + ", who lived in a tree. He loved to " + verb + " and was very " + adjective + 
        ". One day, he met a " + noun2 + " who also loved to " + verb2 + " and was very " + adjective2 + ". They became best friends and lived happily ever after.");
   
    }
    
}
