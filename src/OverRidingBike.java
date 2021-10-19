public class OverRidingBike extends OverRidingVehicle{
    //This  a child class
    //defining the same method as in the parent class

    void run()
    {
        System.out.println("Bike is running Safely");
    }

    public static void main(String args[])
    {
        OverRidingBike overRidingBike = new OverRidingBike();//Create object
        overRidingBike.run();//calling Method
    }

}
