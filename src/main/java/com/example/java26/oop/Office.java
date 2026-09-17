package com.example.java26.oop;

public class Office {

    private Room[] rooms = new Room[10];
    private int roomCounter = 0;

    static int totalRooms = 0;

    public void addRoom(Room room) {
        if (roomCounter < rooms.length) {
            rooms[roomCounter] = room;
            roomCounter++;
            totalRooms++;
        }
        else {
            IO.println("The Office is full!");
        }
    }

    public Room findAvailableRoom(int minCapacity) {
        for (Room room : rooms) {
            if(room.getCapacity() >= minCapacity && !room.isBooked()) {
                return room;
            }
        }
        return null;
    }

    public void printRooms(){
        for (int i = 0; i < roomCounter; i++) {
            if (rooms[i].isBooked()) {
                IO.println(rooms[i].getRoomName() + " is booked!");
            }
            else {
                IO.println(rooms[i].getRoomName() + " is not booked!");
            }
        }
    }

    public void main() {
       Office office = new Office();
       Room room = new Room("Room A", 19);
       Room room2 = new Room("Room B", 20);
       Room room3 = new Room("Room C", 21);
       Room room4 = new Room("Room D", 22);
       Room room5 = new Room("Room E", 23);
       Room room6 = new Room("Room F", 24);
       Room room7 = new Room("Room G", 25);
       Room room8 = new Room("Room H", 26);
       Room room9 = new Room("Room I", 27);
       Room room10 = new Room("Room J", 28);




       office.addRoom(room);
       office.addRoom(room2);
       office.addRoom(room3);
       office.addRoom(room4);
       office.addRoom(room5);
       office.addRoom(room6);
       office.addRoom(room7);
       office.addRoom(room8);
       office.addRoom(room9);
       office.addRoom(room10);


       room.book();
       room2.book();
       room5.book();
       room6.book();
       room7.book();
       room8.book();

        IO.println(office.findAvailableRoom(15));

        IO.println("Avaiable Room: " + room.getRoomName());
        if (room.book() ){
            IO.println("Booking successful!"); }
        else IO.println("Room already booked!");




    }


}
