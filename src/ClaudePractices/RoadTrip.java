package ClaudePractices;

public class RoadTrip {
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private double avgSpeed;
   
    
    public RoadTrip(){
        x1 = 0;
        y1 = 0;

        x2 = 3;
        y2 = 4;

        avgSpeed = 60;

    }

    public RoadTrip(int x1, int x2, int y1, int y2, double avgSpeed){
        this.x1 = x1;
        this.x1 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.avgSpeed = avgSpeed;
    }

    public double getDistance(){
        return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
    }

    public double getSlope(){
        return (double) (y2 - y1) / (double) (x2 - x1);
    }

    public String getMidpoint(){
        return ("(" + (x2 + x1) / 2.0 + ", " + (y2 + y1) / 2.0) + ")";

    }

    public String getTravelTime(){
        double hoursDecimal = getDistance() / avgSpeed;
        int totalSeconds = (int) Math.round(hoursDecimal * 3600);

        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        return hours + " hours, " + minutes + " minutes, " + seconds + " seconds.";
        
    }




    }

