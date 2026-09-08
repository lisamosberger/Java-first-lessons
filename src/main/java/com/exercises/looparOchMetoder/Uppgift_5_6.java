package com.exercises.looparOchMetoder;

public class Uppgift_5_6 {
    //Skriv ett program som frågar användaren efter ett tal mellan 1 och 100
    static void main(){

        int secretNumber = (int)(Math.random() * 100) +1;
        IO.println(secretNumber);

        int usersNumber = Integer.parseInt(IO.readln("Guess the number: "));

        while (usersNumber != secretNumber){
            if (usersNumber > secretNumber){
                IO.println("Try again, your number was to big!");
            }
            else
                IO.println("Try again, your number was to small!");

            usersNumber = Integer.parseInt(IO.readln("Guess again: "));


        }

        IO.println("You gessed the number!");


        //Uppgift 6
        //for(int y=0; y<5; y++) {
        //   		for(int x=0; x<5; x++) {
        //       		if( x == y )
        //           		System.out.print("#");
        //       		else
        //           		System.out.print(".");
        //   		}
        //   		System.out.println("");
        //}

        // Det kommer att skrivas ut #...., .#..., ..#.., ...#., ....#
        // eftersom första loop är y=0 och x=0 -> #, sen y=0 och x=1 -> ., och vidare....

    }
}
