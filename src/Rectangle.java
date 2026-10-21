public class Rectangle {
    //attributes (things every rectangle has)
    //also known as: instance variables
    private int length;
    private int width;


    //special method: constructor
    //first method in a reference-type class
    //will define the value for all the attributes of a rectangle
    public Rectangle(){
        length = 0;
        width = 0;

    }
    //create a constructor with parameters
    //method overloading - 2 methods, same name, different number of parameters
    public Rectangle(int x, int y){
        length = x;
        width = y;
    }
    //this is not a constructor and therefore not special. Needs descriptive words. 
    public double calcArea(){
        return length * width;



    }
    public double calcPerimeter(){
        return 2 * (length+width);
    }

public String toString(){
    return "length is: " + length + " width is: " + width; 
    
}
}
