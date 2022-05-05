/*
Interfaces Abstraction Override
Exercise: 1-abstraction-override

define a subclass Boat of Vehicle that has:
a double attribute maxKnotsSpeed
an int attribute boatKilosWeight
a mandatory override of the abstract method doVehicleSound() where you print the boat's sound
a constructor method that:
accepts 2 params (maxSpeed, weight)
assign the correct values to type, maxKnotsSpeed and boatKilosWeight
a method getBoatWeightAndSpeed that returns an informative String about the total kilos weight and the maximum knots speed
define a tester class where you:
create a Car object and a Boat object
invoke the two Vehicle methods for the newly created Car and Boat objects
print in console the Boat weight and speed using the dedicated method
 */
public class Boat extends Vehicle{
    public double maxKnotSpeed; //velocità massima dei nodi
    public int boatKilosWeight; //peso barca in kg

    @Override
    public void doVehicleSound() {
        System.out.println("\nThe boat plays music");
    }

    public Boat(double maxSpeed, int weight) {
        this.type = "Boat";
        this.maxKnotSpeed = maxSpeed;
        this.boatKilosWeight = weight;
    }

    public String getBoatWeightAndSpeed() {
        return "Max Knot Speed: " + maxKnotSpeed +
                ", Boat Kilos Weight: " + boatKilosWeight;
    }
}
