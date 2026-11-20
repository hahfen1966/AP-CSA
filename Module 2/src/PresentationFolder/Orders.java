package PresentationFolder;

public class Orders {

private String customerName;
private String bobaType;
private String teaFlavor;
private CupDimensions cupSize;
private static double storeRevenue = 0.0;
private static double storeProfit = 0.0;
private static double storeCost = 0.0;

public Orders(String customerName, String bobaType, String teaFlavor, CupDimensions cupSize){
this.customerName = customerName;
this.bobaType = bobaType;
this.teaFlavor = teaFlavor;

this.cupSize = new CupDimensions(cupSize);

storeRevenue += 6.50;
storeCost += 2.00;
storeProfit = storeRevenue - storeCost;
}

public Orders(Orders other){
    this.customerName = other.customerName;
    this.bobaType = other.bobaType;
    this.teaFlavor = other.teaFlavor;

    this.cupSize = new CupDimensions(other.cupSize);
}

public String getCustomerName(){
    return customerName;
}

public void setCustomerName(String customerName){
    this.customerName = customerName;
}

public String getBobaType(){
    return bobaType;
}

public void setBobaType(String bobaType){
    this.bobaType = bobaType;
}

public String getTeaFlavor(){
    return teaFlavor;
}

public void setTeaFlavor(String teaFlavor){
    this.teaFlavor = teaFlavor;
}

public CupDimensions getCupSize(){
    return new CupDimensions(this.cupSize);
}

public void setCupSize(CupDimensions cupSize){
    this.cupSize = new CupDimensions(cupSize);
}

public static double getStoreRevenue(){
    return storeRevenue;
}

public static double getStoreCost(){
    return storeCost;
}

public static double getStoreProfit(){
    return storeProfit;
}

public boolean equals(Orders other){
    return this.customerName.equals(other.customerName) &&
            this.bobaType.equals(other.bobaType) &&
            this.teaFlavor.equals(other.teaFlavor) && 
            this.cupSize.equals(other.cupSize);
}

public String toString(){
    return "Order for " + customerName + " (" + 
            teaFlavor + " with " + bobaType + ")\n" 
            + "Cup Size: " + cupSize.toString(); 
}
}
