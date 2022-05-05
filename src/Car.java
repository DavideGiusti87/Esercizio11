/*
Interfaces Abstraction Override
Exercise: 1-abstraction-override

define a subclass Car of Vehicle that has:
an int attribute numberOfDoors
a double attribute carPrice
an override of the superclass method showVehicleDetails() that:
recalls the super method showVehicleDetails()
prints in console an informative message about the car's numberOfDoors
a mandatory override of the abstract method doVehicleSound() where you print the car's sound
a constructor method that:
accepts 3 params (wheels, doors, price)
assign the correct values to type, numberOfWheels, numberOfDoors and carPrice

 */
public class Car extends Vehicle{
    public int numberOfDoors;
    public double carPrice;

    @Override
    public void showVehicleDetails() {
        super.showVehicleDetails();
        System.out.println("Number Of Doors: " + numberOfDoors);
    }


    @Override
    public void doVehicleSound() {
        System.out.println("The car plays music");
    }

    public Car(int wheels, int doors, double price) {
        this.type = "Car";
        this.numberOfWheels = wheels;
        this.numberOfDoors = doors;
        this.carPrice = price;
    }
}
