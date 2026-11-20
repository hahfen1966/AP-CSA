public class Spaceship {
    private String name;
    private Propulsion propulsion;
    private static int numSpaceships; 

    public Spaceship(){
        name = "";
        propulsion = new Propulsion();
        numSpaceships++; 

    }


    public Spaceship(String name, Propulsion p){
        this.name = name; 
        this.propulsion = new Propulsion(p.getName(), p.getpropType(), p.getpropStrength());
    
    }

    public String getName(){
        return name;
    
    }

    public static int getnumSpaceships(){
        return numSpaceships;
    }

    public Propulsion getPropulsion(){
        return propulsion;
    }
}
