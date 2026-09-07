package com.example.java26.arrays;

public class Error {
    static void main(){
        int[] array = {10,20,30};
//        IO.println(array[3]);
        // Error ArrayIndex is out of bounce
//        IO.println(array[-1]);
        array = new int[Integer.MAX_VALUE - 8]; // must have some space for extra data
        //Out of Memory Error, Java heap space
        //Add VM options -Xms8g -Xmx10g

    }
}
