package PresentationFolder;

public class BobaShop {

public static void main(String[] args){

    CupDimensions medium = new CupDimensions(16.0, true, true, 'M');
    Orders o1 = new Orders("Theo", "Tapioca", "Jasmine", medium);
    Orders o2 = new Orders(o1);
    System.out.println(o1);
    System.out.println("Equal? = " + o1.equals(o2)); 
    System.out.println("Profit: " + Orders.getStoreProfit());

}

    
}
