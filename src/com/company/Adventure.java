package com.company;

public class Adventure extends Movie{
    private String location;

    public Adventure(String title, int duration, String director, String location) {
        super(title, duration, director);
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String printInfo(){
       return "Adventure: " + getTitle() + ", duration: " + getDuration() + ", director: " + getDirector() + ", location: " + this.location + "\n";
    }
}
