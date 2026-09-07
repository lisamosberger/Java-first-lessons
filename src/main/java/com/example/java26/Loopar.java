package com.example.java26;

public class Loopar {
    static void main (){
        for (int i = 0; i < 10; i++){
            IO.println("Hello World!");
        }
        // Print 10 20 30 ... 100
        for (int i = 10; i < 101; i = i + 10) {
            IO.println(i);
        }

        // Print 10 9 8 ... 0
       for (int i = 10; i >= 0; i = i - 1) {
           IO.println(i);
       }
       for (int i = 10; i >= 0; i--) {
           IO.println(i);
       }

       for (int i = 0; i < 10; i++) {
           if (i % 2 == 0){
               continue;
           }
           else if (i > 5)
               break;

           IO.println(i);
       }

       // the variabel only lives in a block and stops existing after it
        // { int i = 1;}
        //int = 1;

        for (char c = 'a'; c<='z'; c++){
            IO.println(c + "(" + (int) c + ")");
        }

//        Write the abc
//        String[] letters = new String[]{"a", "b", "c", "d", "e"};
//       for (int i = 0; i < letters.length; i++){
//           String letter = letters[i];
//           IO.println(letter);
//       }

//      While loopar
        int i = 0;
        while(i < 10){
            IO.println(i);
            i++;
        }

        for (int j = 0; j < 100; j++); // Loopar optimeras alldrig bort (Tomt loop)

        int value = 1;
        for (int j = 0; j < 10; j++) {
            IO.println(value);
            value++;
        }

        boolean done = true;
        int number = 1;
        while (!done){
            IO.println(number);
            number++;
        }

        for (int j = 0; j < 10; j++) {
            IO.println(j);
        }

    }

}
