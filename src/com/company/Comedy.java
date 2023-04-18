package com.company;

public class Comedy extends Movie{
    private int jokeAmount;

    public Comedy(String title, int duration, String director, int jokeAmount) {
        super(title, duration, director);
        this.jokeAmount = jokeAmount;
    }

    public int getJokeAmount() {
        return jokeAmount;
    }

    public void setJokeAmount(int jokeAmount) {
        this.jokeAmount = jokeAmount;
    }

    public String printInfo(){
        return "Comedy: " + getTitle() + ", duration: " + getDuration() + ", director: " + getDirector() + ", joke amount: " + this.jokeAmount + "\n";
    }
}
