public class Propulsion {
    private String name;
    private String propType;
    private int propStrength;
    

    public Propulsion(){
        name = "";
        propType = "";
        propStrength = 0;
    }

    public Propulsion(String name, String propType, int propStrength){
        this.name = name;
        this.propType = propType;
        this.propStrength = propStrength;
    }

    public void setName(String n){
        n = name;

    }

    public void setpropType(String p){
        p = propType;
    }

    public void setpropStrength(int ps){
        ps = propStrength;
    }

    public String getName(){
        return name;
    }

    public String getpropType(){
        return propType;
    }

    public int getpropStrength(){
        return propStrength;
    }

    


}
