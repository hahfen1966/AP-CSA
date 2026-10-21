public class Cookie {
private int calories;
private String flavor;
private boolean isGood;
private double weight;

public Cookie(){
    calories = 10000;
    flavor = "";
    isGood = true;
    weight = 35.2;
}

public Cookie(int calories, String flavor, boolean isGood, double weight){
    this.calories = calories;
    this.flavor = flavor;
    this.isGood = isGood;
    this.weight = weight;
}

public int getCalories(){
    return calories;
}

public void setCalories(int calories){
    this.calories = calories;

}
public String getFlavor(){
    return flavor;
}

public void setFlavor(String flavor){
    this.flavor = flavor;
}

public void setOpinion(boolean isGood){
    this.isGood = isGood;
}

public boolean getOpinion(){
    return isGood;
}

public void setWeight(double weight){
    this.weight = weight;
}

public double getWeight(){
    return weight;
}

public String toString(){
    return "Calories: " + calories + "\n Flavor: " + flavor + "\n Good? " + isGood + "\n Weight: " + weight; 
    } 

public boolean compareCookie(){
if(this.calories == a.calories){

    if(this.weight == a.getWeight()){
        if(this.flavor == a.flavor){
            if(this.isGood == a.isGood){
                return true;
        }   
    }
}
else{
    return false;
}

}
