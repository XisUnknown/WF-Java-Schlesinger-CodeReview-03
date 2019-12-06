package citybikes;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        // Declaring and Intializing Variables, Arrays and ArrayLists
        HashMap<Integer, String> bikeMap = new HashMap<Integer, String>();
        String[] colors = {"green", "blue", "red", "yellow", "white", "black"};
        String[] bikeState = {"CanBeRented", "CanNotBeRented", "InService", "Discarded"};
        ArrayList<Bike> bikes = new ArrayList<Bike>();
        ArrayList<Integer> station1ID = new ArrayList<Integer>();
        ArrayList<Integer> station2ID = new ArrayList<Integer>();
        ArrayList<Integer> station3ID = new ArrayList<Integer>();
        // Creating Stations
        Station station1 = new Station("Hauptbahnhof", station1ID);
        Station station2 = new Station("Meidling", station2ID);
        Station station3 = new Station("Liesing", station3ID);
        // Creating Bikes
        Bike bike1 = new Bike(colors[0], bikeState[0]);
        Bike bike2 = new Bike(colors[1], bikeState[1]);
        Bike bike3 = new Bike(colors[2], bikeState[0]);
        Bike bike4 = new Bike(colors[3], bikeState[2]);
        Bike bike5 = new Bike(colors[4], bikeState[0]);
        Bike bike6 = new Bike(colors[5], bikeState[0]);
        Bike bike7 = new Bike(colors[0], bikeState[1]);
        Bike bike8 = new Bike(colors[1], bikeState[1]);
        Bike bike9 = new Bike(colors[2], bikeState[0]);
        // Adding bikes to ArrayList
        bikes.add(bike1);
        bikes.add(bike2);
        bikes.add(bike3);
        bikes.add(bike4);
        bikes.add(bike5);
        bikes.add(bike6);
        bikes.add(bike7);
        bikes.add(bike8);
        bikes.add(bike9);
        // Adding bikes to the Hashmap (BikeID,BikeColor)
        bikeMap.put(bike1.getbID(), bike1.getColor());
        bikeMap.put(bike2.getbID(), bike2.getColor());
        bikeMap.put(bike3.getbID(), bike3.getColor());
        bikeMap.put(bike4.getbID(), bike4.getColor());
        bikeMap.put(bike5.getbID(), bike5.getColor());
        bikeMap.put(bike6.getbID(), bike6.getColor());
        bikeMap.put(bike7.getbID(), bike7.getColor());
        bikeMap.put(bike8.getbID(), bike8.getColor());
        bikeMap.put(bike9.getbID(), bike9.getColor());
        // Starting Output
        System.out.println("CityBike RentingSystem");
        // Outputing all bikes
        System.out.println("All Bikes: ");
        for (Bike bike : bikes) {
            System.out.println(bike.toString());
        }
        // Outputting Hashmap
        System.out.println("All Bikes (Hashmap): ");
        bikeMap.forEach((key, value) -> System.out.println("[Key] : " + key + " [Value] : " + value));

        // Outputting Stored Bikes in the Station.
        System.out.println("Station 1");
        System.out.println(station1.getBikesStored());
        System.out.println("Station 2");
        System.out.println(station2.getBikesStored());
        System.out.println("Station 3");
        System.out.println(station3.getBikesStored());
        // Adding Bikes via Method
        // Station1
        station1.addBike(bikes.get(0).getbID());
        station1.addBike(bikes.get(1).getbID());
        station1.addBike(bikes.get(2).getbID());
        // Station2
        station2.addBike(bikes.get(3).getbID());
        station2.addBike(bikes.get(4).getbID());
        station2.addBike(bikes.get(5).getbID());
        station2.addBike(bikes.get(6).getbID());
        // Ouptutting updated Stations
        System.out.println("Station 1");
        System.out.println(station1.getBikesStored());
        System.out.println("Station 2");
        System.out.println(station2.getBikesStored());
        System.out.println("Station 3");
        System.out.println(station3.getBikesStored());
        // Creating Users
        User user1 = new User("Max", "Mustermann", -1);
        User user2 = new User("Minnie", "Maus", -1);
        User user3 = new User("Mickey", "Maus", -1);
        // Outputting Users
        user1.toString();
        user2.toString();
        user3.toString();
        // Renting/Returning Process Demo
        // If User has not rented a bike user.bID is -1 else it has the BikeID
        System.out.println(
                "User1 has not rented a bike. bID: "
                        + user1.getbID()
                        + "\n"
                        + "Station 1 has following bikes:"
                        + station1.getBikesStored());
        user1.rentBike(bikes.get(0).getbID(), station1, bikeState, bikes.get(0).getBikeStatus());
        System.out.println(
                "User1 has rented a bike at "
                        + user1.getCalendar().getTime()
                        + ". bID:"
                        + user1.getbID()
                        + "\n"
                        + "Station 1 has now the following bikes:"
                        + station1.getBikesStored());
        System.out.println("Station 2 has the following bikes: " + station2.getBikesStored());
        user1.returnBike(bikes.get(0).getbID(), station2);
        System.out.println(
                "User1 returned the bike to station 2 at "
                        + user1.getCalendar().getTime()
                        + " and the bID is: "
                        + user1.getbID());
        System.out.println("Station 2 has now the following bikes:" + station2.getBikesStored());
    }
}
