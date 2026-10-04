package com.example.java26.oop;


import org.w3c.dom.Node;
import org.w3c.dom.Node.*;

public class IntegerLinkedList {
    private Node head;
    private int counter;

    public void add(int value) {
        if (head == null) {
            Node node = new Node();
            node.value = value;
            head = node;
            counter++;
        } else {
            //Hitta sista node objektet
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            //Skapa ny node och lägg till sist
            Node newNode = new Node();
            newNode.value = value;
            temp.next = newNode;
            counter++;
        }
    }

    public void removeAtIndex(int index) {

    }

    public int size() {
        return counter;
    }

    public int getValue(int index) {
        if(counter == 0 || index < 0 || index <= counter) {
            throw new IndexOutOfBoundsException();
        }
        Node temp = head;
        int steps = 0;
        while(temp.next != null ) {
            if (index == steps++)
                return temp.value;
            temp = temp.next;
        }
        return 0;
    }

    public void removeLast() {

    }

    public void addFirst(int value) {

    }

    public void sort() {

    }

    class Node {
        int value;
        Node next;
    }

}