//A separate class for Flight Manifest, a blueprint to make flight manifest objects in main
//Contains methods to manipulate the flight manifest

public class FlightManifest {
    // Fixes the array of passengers of integers with 12 elements
    //Array holds objects of the data type Passenger
    Passenger[] passengerList = new Passenger[12];

    // Here is an empty constructor, the blueprint for the flight manifest object to
    // be instantiated in main
    public FlightManifest() {
    }

    // ADD PASSENGER: takes input name and input age as arguments, checks array for
    // empty spot
    public void addPassenger(String receivedName, int receivedAge) {
        // For loop in 3 parts(starting point; condition; counter/incrementer);
        for (int i = 0; i < 12; i++) {
            if (passengerList[i] == null) {
                passengerList[i] = new Passenger(receivedName, receivedAge);
                int newSeat = i + 1;
                System.out.println(receivedName + " is assigned seat #: " + newSeat);
                break;

            }

        }

    }

    //

    // Iterate through the seats on the plane to assign passenger to first empty
    // seat found

    public int getSeatNumber(int indexNumber) {
        return (indexNumber + 1);

    }

    public void removePassenger(int seatNumber) {
        for (int i = 0; i < 12; i++) {
            if (i == (seatNumber - 1)) {
                // Passenger is removed via setting the index element to null
                System.out.println("You have removed passenger " + passengerList[i].getName() + " from seat #: " +
                        seatNumber + ".");
                passengerList[i] = null;
            }
        }

    }

    public void switchPassenger(int receivedSeat, int changedSeat) {
        int indexOfPassenger1 = receivedSeat - 1;
        int indexOfPassenger2 = changedSeat - 1;
        Passenger TempPassenger;

        TempPassenger = (passengerList[indexOfPassenger1]);
        passengerList[indexOfPassenger1] = passengerList[indexOfPassenger2];
        passengerList[indexOfPassenger2] = TempPassenger;
        System.out.println(passengerList[indexOfPassenger2].getName() + " has been moved to seat #: " + changedSeat);
        System.out.println(passengerList[indexOfPassenger1].getName() + " has been moved to seat #: " + receivedSeat);
    }


    public void renamePassenger (int seatNumberGiven, String nameGiven){
        int indexOfPassenger = seatNumberGiven-1;
        String oldName = passengerList[indexOfPassenger].getName();
        passengerList[indexOfPassenger].setName(nameGiven);


        System.out.println("Passenger: " + oldName + " of seat #: " + seatNumberGiven + " has been renamed to: " + nameGiven);
    }

    public int countPassengers(){
        int count = 0;
        for (int i = 0; i < 12; i++){
            if (passengerList[i] != null) {
                count += 1;
            }
        }
        System.out.println("The flight manifest currently has " + count + " passengers.");
        return count;
    }
    public void printManifest(){

        System.out.println("##### PASSENGER MANIFEST ######");
        System.out.println("SkyBox Ltd.");
        System.out.println("Seat\t    Name\t    Age");
        System.out.println();
        for (int i = 0; i < 12; i++){
            if(passengerList[i]!=null){
                System.out.println((i+1) + "\t    " + passengerList[i].getName() + "\t    " + passengerList[i].getAge());
            }
            else {
                System.out.println((i+1) + " ");
            
            }
        }
        System.out.println("##### ##### ##### ##### ##### ###");
        
    }

    
}
