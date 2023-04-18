package com.company;

public class Movie {
    private String title;
    private String genre;
    private int duration;
    private String director;

    public Movie(String title, int duration, String director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String printInfo(){
        return "Movie: " + this.title + ", genre: " + this.genre + ", duration: " + this.duration + ", director: " + this.director + "\n";
    }

    public void pause(int timeViewed){
        int timeLeft = this.duration - timeViewed;
        System.out.println("Time left to watch " + this.title + ": " + timeLeft);
    }
}
