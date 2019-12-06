package citybikes;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


class UserTest {

    Bike bike1;
    Bike bike2;
    Bike bike3;
    Bike bike4;
    User user1;
    User user2;
    User user3;
    String[] colors = {"green", "blue", "red", "yellow", "white", "black"};
    String[] bikeState = {"CanBeRented", "CanNotBeRented", "InService", "Discarded"};
    ArrayList<Integer> station1ID = new ArrayList<Integer>();
    ArrayList<Integer> station2ID = new ArrayList<Integer>();
    Station station1 = new Station("Hauptbahnhof", station1ID);
    Station station2 = new Station("Meidling", station2ID);
    ArrayList<Bike> bikes = new ArrayList<Bike>();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        bike1 = new Bike(colors[0], bikeState[0]);
        bike2 = new Bike(colors[1], bikeState[1]);
        bike3 = new Bike(colors[2], bikeState[2]);
        bike4 = new Bike(colors[3], bikeState[3]);
        user1 = new User("name1", "name2", 0);
        user2 = new User("name1", "name2", 1);
        user3 = new User("name1", "name2", 2);
        bikes.add(bike1);
        bikes.add(bike2);
        bikes.add(bike3);
        bikes.add(bike4);
        station1.addBike(bikes.get(0).getbID());
        station1.addBike(bikes.get(1).getbID());
        station2.addBike(bikes.get(2).getbID());
        station2.addBike(bikes.get(3).getbID());
    }

    @Test
    void testRent() {
        user1.rentBike(1, station1, bikeState, bikes.get(0).getBikeStatus());
        assertEquals(1, user1.getbID());
        user2.rentBike(2, station1, bikeState, bikes.get(1).getBikeStatus());
        assertEquals(-1, user2.getbID());
        user1.returnBike(0, station2);
        assertEquals(-1, user1.getbID());
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void getRent() {
    }

    @org.junit.jupiter.api.Test
    void getCalendar() {
    }

    @org.junit.jupiter.api.Test
    void getuID() {
    }

    @org.junit.jupiter.api.Test
    void setuID() {
    }

    @org.junit.jupiter.api.Test
    void getName() {
    }

    @org.junit.jupiter.api.Test
    void setName() {
    }

    @org.junit.jupiter.api.Test
    void getSurname() {
    }

    @org.junit.jupiter.api.Test
    void setSurname() {
    }

    @org.junit.jupiter.api.Test
    void getbID() {
    }

    @org.junit.jupiter.api.Test
    void setbID() {
    }

    @org.junit.jupiter.api.Test
    void getuIDCounter() {
    }

    @org.junit.jupiter.api.Test
    void setuIDCounter() {
    }

    @org.junit.jupiter.api.Test
    void testToString() {
    }

    @org.junit.jupiter.api.Test
    void rentBike() {
    }

    @org.junit.jupiter.api.Test
    void returnBike() {
    }

}