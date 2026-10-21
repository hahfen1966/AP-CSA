public class ChangeMaker {
    
    public static int quarterCount(int cents){
        return cents/25;
    }

    public static int remainderAfterQuarters(int cents){
        return cents % 25;
    }

    public static double centsToDollars(int cents){
        return (double) cents / 100;

    }

    public static int numDimes(int cents){
       return remainderAfterQuarters(cents) / 10;
    }
}
