package PresentationFolder;

public class CupDimensions {
private double fluidOunces;
private boolean hasStraw;
private boolean hasLid;
private char sizeLabel;

public double getfluidOunces(){
return fluidOunces;
}

public boolean gethasStraw(){
return hasStraw;
}

public boolean gethasLid(){
return hasLid;
}

public char getsizeLabel(){
return sizeLabel;
}

public void setfluidOunces(double fluidOunces){
this.fluidOunces = fluidOunces;
}

public void sethasStraw(boolean hasStraw){
this.hasStraw = hasStraw;
}

public void sethasLid(boolean hasLid){
this.hasLid = hasLid;
}

public void setsizeLabel(char sizeLabel){
this.sizeLabel = sizeLabel;
}

public CupDimensions(double fluidOunces, boolean hasStraw, boolean hasLid, char sizeLabel){
    this.fluidOunces = fluidOunces;
    this.hasStraw = hasStraw;
    this.hasLid = hasLid;
    this.sizeLabel = sizeLabel;
}

public CupDimensions(CupDimensions other){
    this.fluidOunces = fluidOunces;
    this.hasStraw = hasStraw;
    this.hasLid = hasLid;
    this.sizeLabel = sizeLabel;
}

public boolean equals(CupDimensions other){
    return this.fluidOunces == other.fluidOunces &&
            this.hasStraw == other.hasStraw &&
            this.hasLid == other.hasLid &&
            this.sizeLabel == other.sizeLabel;
        }

public String toString(){
    return sizeLabel + " (" + fluidOunces + " oz), straw: " 
    + hasStraw + ", lid: " + hasLid;}
}



