/*
Interfaces Abstraction Override
Exercise: 1-abstraction-override

define an abstract class called Vehicle that has:
a string attribute type
an int attribute numberOfWheels
a method showVehicleDetails() that prints in console an informative message about the type and the numberOfWheels
an abstract method doVehicleSound()
 */
public class Vehicle {
    public String type;
    public int numberOfWheels;

    public void  showVehicleDetails(){
        System.out.print("Vehicle\n" +
                "Type:'" + type + '\'' +
                ", Number Of Wheels: " + numberOfWheels +
        ", ");
    }

    public void doVehicleSound(){}
}
