public class MethodTesting {
    public static void main(String[] args) {
      /*   System.out.println(Math.abs(-5+20-(-10)));
        System.out.println(Math.pow(2,4));
        System.out.println(Math.sqrt(81));
        System.out.println(Math.max(6,9));
        System.out.println(Math.min(6,9));
        System.out.println(Math.min(10,2));
        System.out.println(Math.round(2.333));
        System.out.println(Math.PI);
        System.out.println(Math.random());
*/

    /*   System.out.println((int)(Math.random()*26)+5); //IMPORTANT FOR AP EXAM */
  

//Static. 

        Rectangle r = new Rectangle();
        Rectangle r1 = new Rectangle(1,2);
        r1.calcArea();
        double w = r1.calcArea();
        System.out.println(w);

         r1.calcPerimeter();
         double p = r1.calcPerimeter();
         System.out.println(p);

        Rectangle r12 = new Rectangle (1,2);
        System.out.println(r12.toString());
      

/*
         Circle c = new Circle();
         Circle c1 = new Circle(5);
         c1.calcArea();
         double a = c1.calcArea();
         System.out.println(a);
    }
*/
        Circle c12 = new Circle(5); 
        System.out.println(c12.toString());
   

}
}
/* Method type 1
    public static void main(String[] args) {
       
       Scanner s1 = new Scanner(System.in);
        s1.nextline();
    }
        */


/* Static means that the method belongs to the class rather than an instance of the class. 
Scanner methods are not static, math and sum methods are static. */
/* 
Circle c1 = new Circle(1);
    System.out.println(c1.getRadius());
    c1.setRadius(10);
    System.out.print(c1.getRadius());

    String myString = "Hi";
    myString = "Hello";

    System.out.println(myString.length());
    System.out.println(myString.substring(0,4));
    System.out.println(myString.substring(1));

    String myString2 = "Hello";
    System.out.println(myString2.equals(myString2));
    //compares contents of string not the memory location which may differ.
    System.out.println(myString.indexOf("l"));
    //should give us location of the first l in hello. 
    System.out.println("D".compareTo("d"));
    //takes the ASCII number value for D and subtracts the ASCII number value for d. 
    //Example
    String str1 = "Karel";
    String str2 = "Karen";
    System.out.println(str1.compareTo(str2));
    x
*/


