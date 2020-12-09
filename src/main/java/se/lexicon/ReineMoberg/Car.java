package se.lexicon.ReineMoberg;

//User defined class
public class Car {

    String brand;
    String regNumber;
    int maxSpeed;
    String ownerName;

    public String printInfo(){
        return "Brand: " + brand + "\n" + "Registration: " + regNumber + "\n" + "Speed: " + maxSpeed + "\n" + "Name: " + ownerName;

        }
}
