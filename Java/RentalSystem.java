interface Vehicle{
    public void start();
    public void stop();
}
interface FuelBased{
    public void refuel();
}
class Car implements Vehicle,FuelBased{
    public void start(){
        System.out.println("Car engine started.");
    }
    public void stop(){
        System.out.println("Car engine stopped.");
    }
    public void refuel(){
        System.out.println("Car is refueling at the station.");
    }
}

class ElectricScooter implements Vehicle{
    public void start(){
        System.out.println("Electric scooter powered on.");
    }
    public void stop(){
        System.out.println("Electric scooter powered off.\n");
    }
}
public class RentalSystem {
    public static void main(String[] args) {
        Car c = new Car();
        ElectricScooter es = new ElectricScooter();
        System.out.println("\n--Properties of Car class--");
        c.start();
        c.refuel();
        c.stop();
        System.out.println("\n--Properties of ElectricScooter class--");
        es.start();
        es.stop();

    }
}
