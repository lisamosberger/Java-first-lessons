package com.example.java26.oop;

public class Room {
    private String roomName;
    private int capacity;
    private boolean isBooked;

    public Room(String roomName, int capacity) {
        roomName = "Unknown";
        capacity = 0;
        isBooked = false;
    }

    public Room(Room room) {
        this.roomName = room.roomName;
        this.capacity = room.capacity;
        this.isBooked = room.isBooked;
    }

    public boolean book() {
        if (!isBooked) {
            isBooked = true;
            IO.println(roomName + " is now booked");
        }
        else {
            IO.println(roomName + " is already booked");
        }
        return false;
    }

    public void cancelBook() {
        if (isBooked) {
            isBooked = false;
            IO.println(roomName + " booking has been cancelled");
        }
        else {
            IO.println(roomName + " is not booked");
        }
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
