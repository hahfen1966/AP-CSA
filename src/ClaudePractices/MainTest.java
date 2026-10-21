package ClaudePractices;

public class MainTest {
    public static void main(String[] args){
        
        
        Cylinder c = new Cylinder(2.0, 8.0);
        c.initialize();
        c.printCylinderData();

        Cylinder b = new Cylinder();
        b.initialize();
        b.printCylinderData();

        new RoadTrip(0, 0, 30, 40, 60); 
        new RoadTrip(10, 5, 400, 295, 55);

       
    }
}
