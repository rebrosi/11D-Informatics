package uti;


import java.util.ArrayList;
import java.util.Arrays;


public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HotelChain hotelChain1 = new HotelChain();
		hotelChain1.nameOfHotelChain = "Hilton";
		Hotel hotel1 = new Hotel();
		hotel1.nameOfHotel = "Hilton Sofia";
		Hotel hotel2 = new Hotel();
		hotel2.nameOfHotel = "Hilton Paris";
		hotelChain1.hotels = new ArrayList<Hotel>(Arrays.asList(hotel1, hotel2));
		Room room1 = new Room();
		room1.numberOfTheRoom = 101;
		Room room2 = new Room();
		room2.numberOfTheRoom = 102;
		hotel1.rooms = new ArrayList<Room>(Arrays.asList(room1, room2));
		Room room3 = new Room();
		room3.numberOfTheRoom = 103;
		Room room4 = new Room();
		room4.numberOfTheRoom = 104;
		hotel2.rooms = new ArrayList<Room>(Arrays.asList(room3, room4));
		RoomOwner owner1 = new RoomOwner();
		owner1.nameOfTheOwner = "Ivan Radoev";
		owner1.room = room1;
		room1.owner = owner1;
		RoomOwner owner2 = new RoomOwner();
		owner2.nameOfTheOwner = "Elisaveta Bagriana";
		owner2.room = room2;
		room2.owner = owner2;
		RoomOwner owner3 = new RoomOwner();
		owner3.nameOfTheOwner = "Dora Gabe";
		owner3.room = room3;
		room3.owner = owner3;
		RoomOwner owner4 = new RoomOwner();
		owner4.nameOfTheOwner = "Boyko Borisov";
		owner4.room = room4;
		room4.owner = owner4;
		System.out.println("In the hotel chain " + hotelChain1.nameOfHotelChain + " there are the hotels:\n" + hotel1.nameOfHotel + " and " + hotel2.nameOfHotel);
		System.out.println("In " + hotel1.nameOfHotel + " the list of rooms and their owners is:");
		for(Room room : hotel1.rooms) {
			System.out.println(room.numberOfTheRoom + " " + room.owner.nameOfTheOwner);
		}
		System.out.println("In " + hotel2.nameOfHotel + " the list of rooms and their owners is:");
		for(Room room : hotel2.rooms) {
			System.out.println(room.numberOfTheRoom + " " + room.owner.nameOfTheOwner);
		}
	}

}
