package com.example.java26;

import java.util.Locale;

public class StringDemo {
    static void main (){
        String name = "Kalle";
        name = name + " Anka ";

        IO.println(name);
        var lowerCase = name.toLowerCase();
        var length = name.length();
        IO.println(length);
        IO.println(lowerCase);
        IO.println(name.charAt(0)); // Print bokstaven som står på ställe 0

        //Printa alla bokstaver i namnet
        for (int i = 0; i < name.length(); i++) {
            IO.println(name.charAt(i));
        }


        String choice = IO.readln("Press e or p: ");
        switch (choice.toLowerCase()) {
            case "e"-> IO.println("You picked eternal pain");
            case "i"-> IO.println("You picked pain");
        }

        if (choice.isEmpty() ) IO.println("You picked empty pain");
        if (choice.startsWith("e"))
            IO.println("Your choice starts with 'e'");

        IO.println(name.repeat(3));

        /**
         * if (choice.length() == 0 ){}
         *  name.isEmpty();
         *  both is the same thing
         */



    }
}
