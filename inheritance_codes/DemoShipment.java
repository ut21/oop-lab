package bitsoop.inheritance;

public class DemoShipment {

    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);
        double vol;

        vol = shipment1.volume();
        System.out.println("Volume of shipment1 is " + vol);
        System.out.println("Weight of shipment1 is " + shipment1.weight);
        System.out.println("Shipping cost: $ " + shipment1.cost);
        System.out.println();

        vol = shipment2.volume();
        System.out.println("Volume of shipment2 is " + vol);
        System.out.println("Weight of shipment2 is " + shipment2.weight);
        System.out.println("Shipping cost: $ " + shipment2.cost);
    }
}

/*
This example illustrates one other important point:
super( ) always refers to the constructor in the closest superclass.
The super( ) in Shipment calls the constructor in BoxWeight.
The super( ) in BoxWeight calls the constructor in Box.
In a class hierarchy, if a superclass constructor requires arguments,
then all subclasses must pass those arguments “up the line.”
This is true whether or not a subclass needs arguments of its own.
 */
