package com.programmer;

import java.util.ArrayList;

public class Moviemanager {
    record Movie(String title, int year, String director, int duration) {}
    static void main (){

        ArrayList<Movie> movies = new ArrayList<>();

        while(true){
            String title = IO.readln("Title of the movie or 1 to exit: ");
            if (title.equals("1")){
                break;
            }
            int year = Integer.parseInt(IO.readln("Year of the movie: "));
            String director = IO.readln("Director of the movie: ");
            int duration = Integer.parseInt(IO.readln("Duration of the movie: "));

            movies.add(new Movie(title, year, director, duration));

        }

        for (Movie movie : movies) {
        IO.println("Movie: " + movie.title);
        IO.println("Year: " + movie.year);
        IO.println("Director: " + movie.director);
        IO.println("Duration: " + movie.duration);
        IO.println("=======================");}
    }

}

