public class Power {
   private String name;
   private int strength;
   private int damage;
   

   //If you write no constructors, java will hallucinate the default constructor for you. 
   //However, if you do create a constructor, it will not hallucinate another one.

   public Power(){
    name = "";
    strength = 0;
   }

   public Power(String name, int strength){
        this.name = name;
        this.strength = strength;

   }

   public void setName(String n){
        name = n;
   }

   public void setStrength(int s){
        strength = s;
   }

   public String getName(){
        return name;
   }

   public int getStrength(){
        return strength;
   }
   public String toString(){
     return "Name:  , " + name + "Strength: " + strength + ""
   }
   public void damageTaken(int damage){
    
   }
    
}
