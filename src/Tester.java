/*
Interfaces Abstraction Override
Exercise: 1-abstraction-override


define a tester class where you:
create a Car object and a Boat object
invoke the two Vehicle methods for the newly created Car and Boat objects
print in console the Boat weight and speed using the dedicated method
 */
public class Tester {
    public static void main(String[] args) {
        Car car = new Car(4,3,25850.00);
        Boat boat = new Boat(34,6000);
        car.showVehicleDetails();
        car.doVehicleSound();
        boat.showVehicleDetails();
        System.out.print(boat.getBoatWeightAndSpeed());
        boat.doVehicleSound();

    }


}
