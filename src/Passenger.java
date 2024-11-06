//Here is the platonic ideal of the passenger
//Passenger class 
public class Passenger {

    //Define instance variables

    private String name;
    private int age;


    //Constructor method - blueprint for passenger objects, reassigns
    //instance variables to the specific values given
    public Passenger (String name, int age){
        this.name = name;
        this.age = age;

    }

    //Empty constructor as specified in specification
    public Passenger (){

    }

    //Retrieve seat of passenger

    public int getSeatNumber(int indexNumber) {
        return (indexNumber + 1);

    }

    //Getters

    public String getName () {
        return this.name;
    }

    public int getAge () {
        return this.age;
    }

    //Setters

    public void setName (String name) {
        this.name = name;
    }

    public void setAge (int age) {
        this.age = age;
    }

}