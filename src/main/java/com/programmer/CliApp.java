package com.programmer;

public class CliApp {
    static void main (){
        boolean running = true;
        do {
            getMenuText();
            IO.println(getMenuText());
            String choice = IO.readln("Pick a number: ");
            switch (choice){
                case "1" -> IO.println("Hello");
                case "2" -> IO.println("Goodbye");
                case "3" -> running = false;
            }
        } while (running);

        // Print menu
        //Ask for choice
        // Do it
        // Repeat
    }

    private static String getMenuText() {
        String menuText = """
                Menu 
                --------------
                1. Say hello
                2. Say goodbye
                3. Exit
                """;
        return menuText;
    }
}
