package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class Main{

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("output.txt");
        /*Comedy m1 = new Comedy("#1", 180, "Vasja #1", 5);
        Comedy m2 = new Comedy("#2", 100, "Vasja #2", 10);
        Documentary m3 = new Documentary("#3", 200, "Vasja #3", "Egypt", 10, "25.02.2000");
        Documentary m4 = new Documentary("#4", 90, "Vasja #4" ,"USSR", 11, "01.01.1991");
        Adventure m5 = new Adventure("#5", 120, "Vasja #5", "Latvia");
        Adventure m6 = new Adventure("#6", 58, "Vasja #6", "USA");

        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(m1);
        movies.add(m2);
        movies.add(m3);
        movies.add(m4);
        movies.add(m5);
        movies.add(m6);

        for (Movie movie : movies){
            fw.write(movie.printInfo());
        }

        fw.close();*/
        new StartForm(null);
    }
}
