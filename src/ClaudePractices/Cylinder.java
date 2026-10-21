package ClaudePractices;

import java.util.Scanner;

public class Cylinder {
    private double radius;
    private double height;

    public Cylinder(){
        radius = 1.0;
        height = 1.0;

    }

    public Cylinder(double r, double h){
        this.radius = r;
        this.height = h;
    
    }
    
    public void initialize(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a radius pls: ");
        radius = sc.nextDouble();
        System.out.println("Enter a height pls: ");
        height = sc.nextDouble();

    }

    public void printCylinderData(){
        double surfaceArea = 2 * Math.PI * (radius * radius) + 2 * Math.PI * radius * height;
        double volume = Math.PI * (radius * radius) * height; 

        System.out.println("Radius: " + radius);
        System.out.println("Height: " + height);
        System.out.println("Surface Area: " + surfaceArea);
        System.out.println("Volume: " + volume);

        
    }
}
