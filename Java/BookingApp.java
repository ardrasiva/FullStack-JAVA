import java.util.Scanner;
abstract class Ride{
    public abstract int CalculateFare(int distance);
    public void rideType(){
        System.out.println("Generic Ride");
    }
}

class AutoRide extends Ride{
    public int CalculateFare(int distance){
        return distance*10;
    }
    public void rideType(){
        System.out.println("\nAuto Ride");
    }
}

class CarRide extends Ride{
    public int CalculateFare(int distance){
        return distance*20;
    }
    public void rideType(){
        System.out.println("\nCar Ride");
    }
}

public class BookingApp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Ride r = null;
        String type;
        int dist;
        System.out.print("Enter the ride type : ");
        type = s.nextLine();
        System.out.print("Enter the distance : ");
        dist = s.nextInt();
        if(type.equalsIgnoreCase("auto")){
            r = new AutoRide();
        }
        else if(type.equalsIgnoreCase("Car")){
            r = new CarRide();
        }
        else{
            System.out.println("Invalid input");
        }
        r.rideType();
        int fare = r.CalculateFare(dist);

        System.out.println("Type of ride : "+type);
        System.out.println("Distance : "+dist+"km");
        System.out.println("Total Fare : "+fare+"Rs");
        s.close();

        
    }
}
