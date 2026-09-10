package com.exercises.looparOchMetoder;

public class Uppgift_10 {
    static void main (){

        int a = Integer.parseInt(IO.readln("Give me a number: "));
        int b = Integer.parseInt(IO.readln("Give me another number: "));
        int c = Integer.parseInt(IO.readln("Give me a third number"));

        int result = Calc.sum(a , b);
        int result2 = Calc.sum(a, b, c);

        IO.println("The first two numbers are = " + result + ". With the third number it will be = " + result2);

        int [] array = {1, 4, 5, 7};
        IO.println(Calc.sum(array));

        String numbers = IO.readln("Give me some numbers: ");

        IO.println(Calc.sum(numbers));



    }
}
