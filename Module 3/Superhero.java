public class Superhero {

    private String name;
    private Power power;
    private static int numSuperheroes; //not specific to any one instantiation of superhero

    public Superhero(){
        name = "";
        power = new Power();
        numSuperheroes++;
        /*power.setName("");
        power.setStrength(0); */
    }

    public Superhero(String n, Power p){
        n = name;
        p = new Power(p.getName(), p.getStrength());
        numSuperheroes++;

    }

    public String getName(){
        return name;
    }
    
    public String toString(){
        //return "Name: " + name + "Power: " + power.toString();
        return "Name: " + name + "Power: " + power.getName() + " " + power.getStrength();
        //return "Name: " + name + "Power: " + power; This would print power's toString rather
        //than its memory location bc it is defined in the power class. 
    }

    public static int getnumSuperheroes(){
        return numSuperheroes;
    }
}
