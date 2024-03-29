package CoreJava.Q18.Part3;


public interface Vehicle {
    static void display(String name) {

        System.out.println("Vehicle details:");
    }
    default void run(){

        System.out.println("Vehicle is running");
    }
}
interface VehicleTest{
    public default void run(){

        System.out.println("In Vehicle Test Interface");
    }
}

class Bike implements Vehicle, VehicleTest{
    String name;
    Bike(String name){
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println("Bike is running.... from Vehicle interface");
        System.out.println("Bike is running.... from VehicleTest interface");
    }

    public static void display(String name){

        System.out.println("Bike name : "+name);
    }
}