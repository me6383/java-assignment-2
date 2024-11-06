//A program to handle the flight manifest.
//import the Scanner method:
//App has main method and runs the user interface -takes input from user & prints out messages
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        //new object from Scanner class
        Scanner myScanner = new Scanner(System.in);
        boolean keepRunning = true;
        FlightManifest fmObject = new FlightManifest();

        //Keeps menu reappearing until user exits
        while (keepRunning) {

            //Offer menu options:
            System.out.println("What would you like to do?");

            //Must take input with any of the following actions:
            //- Insert passenger in first available seat, - Remove passenger
            //- Switch sweat, - Rename passenger, - Count passenger,
            //- Print manifest 
            System.out.println();
            System.out.println("1 - Insert passenger");
            System.out.println("2 - Remove passenger");
            System.out.println("3 - Switch seats");
            System.out.println("4 - Rename passenger");
            System.out.println("5 - Count passengers");
            System.out.println("6 - Print passenger manifest");
            System.out.println("7 - Exit");
            System.out.println();
            System.out.println("Select an option from 1-7:");

        

        //Save the option chosen as a variable
        int choiceMade = myScanner.nextInt();
        //Clears old scanner data (the new line character lingers from the user pressing ENTER after
        //nextInt, so it must be cleared)
        myScanner.nextLine();
        

        //Call the variable in the switch (a control-flow method) to prompt execution of that section of code
        //switch statement tests expressions based only on a single integer
        switch (choiceMade) {
            //case 1: is the same as "if choiceMade == 1"
            case 1: 
                System.out.println("Enter passenger name:");
                String inputName = myScanner.nextLine();
                System.out.println("Enter passenger age:");
                int inputAge = myScanner.nextInt();
                myScanner.nextLine();

                fmObject.addPassenger(inputName, inputAge);
                

                break;
            case 2: 
                System.out.println("Enter the seat number of the passenger you would like to remove: ");
                int inputSeat = myScanner.nextInt();
                myScanner.nextLine();

                fmObject.removePassenger(inputSeat);


                break;

            case 3: 
                System.out.println("Enter the seat number of the first passenger you would like to switch seats: ");
                int inputChangeSeat = myScanner.nextInt();
                myScanner.nextLine();
                System.out.println("Enter the seat number of the passenger you would like to switch with: ");
                int inputDesiredSeat = myScanner.nextInt();
                myScanner.nextLine();

                fmObject.switchPassenger(inputChangeSeat, inputDesiredSeat);
                break;
            case 4: 
                System.out.println("Enter the seat number of the passenger you would like to rename: ");
                int inputSeatNumber = myScanner.nextInt();
                myScanner.nextLine();
                System.out.println("Enter the name you would like to rename the passenger to: ");
                String inputNewName = myScanner.nextLine();

                fmObject.renamePassenger(inputSeatNumber, inputNewName);
                break;
            case 5: 
                fmObject.countPassengers();
                break;
            case 6: 
                fmObject.printManifest();
                break;
            case 7:
                keepRunning = false;
                System.out.println("Thank you, come again.");
                break;
            default: System.out.println("Invalid option chosen");
                break;

        }

        //System.out.println(fmObject.passengerList[0].getName() + " " + fmObject.passengerList[0].getAge());
//skapa en ny metod for add, delete, every function etc. create a method
//call upon the method when you take in input, and assign input to new value

            //Passenger.getName(inputNamePassenger1);

        
    
//for(int i = 0; i <= 12; i++){ -- to print out manifest
// For loop in 3 parts(starting point; condition; counter/incrementer);

    }
    myScanner.close();

    }
}

