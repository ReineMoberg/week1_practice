package se.lexicon.ReineMoberg;

//User defined class with a method
//OBS! There can be only one main method in project
public class Person {

    String firstName;
    String lastName;
    int age;
    String hobby;

    public String getInformation(){
        return firstName + " " + lastName + " is " + age + " years old and likes " + hobby;
    }

    /*public static void main( String[] args ) {
        Person reine = new Person();
        reine.firstName = "Reine";
        reine.lastName = "Moberg";
        reine.age = 51;
        reine.hobby = "running";
        System.out.println(reine.getInformation());

    }*/
}
