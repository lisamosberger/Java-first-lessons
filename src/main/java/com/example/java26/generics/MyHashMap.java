package com.example.java26.generics;

import org.w3c.dom.Node;

import java.util.HashMap;

public class MyHashMap {
    private int DEFAULT_CAPACITY = 16;
    private float LOAD_FACTOR = 0.75f;
    Node[] buckets = new Node[DEFAULT_CAPACITY];
    private int size = 0;

    public void put(String key, String value) {
      int index = getIndex(key);
      var head = buckets[index];


    }
    private int getIndex(String key){
        int hashCode = key.hashCode();
        return Math.abs(hashCode) % buckets.length; //Math.abs means it will be always positive
    }

    public String get(String key) {

    }

    class Node {
        String key;
        String value;
        Node next;
    }


    static void main (){
        HashMap
        String s1 = "Aa";
        String s2 = "BB";
        String s3 = "Cc";

        IO.println(s1.hashCode());
        IO.println(s2.hashCode());
        IO.println(s1.equals(s2));
        IO.println(s3.hashCode());
    }


}
