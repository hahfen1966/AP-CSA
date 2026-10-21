public class Circle {
    private int radius;

    public Circle(){
        radius = 0; 

}
    public Circle(int f){
         radius = f; }

    
   public double calcArea(){
        return Math.PI * radius * radius;

   }

   public double calcPerimeter(){
        return 2 * Math.PI * radius;
   }

   public void setRadius(int r){
        radius = r;
   }

   public int getRadius(){
        return radius;
   }

public String toString(){
     return "radius is: " + radius;
}
}
