package com.company;

public class Documentary extends Movie{
    private String theme;
    private int factAmount;
    private String eventDate;

    public Documentary(String title, int duration, String director, String theme, int factAmount, String eventDate) {
        super(title, duration, director);
        this.theme = theme;
        this.factAmount = factAmount;
        this.eventDate = eventDate;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public int getFactAmount() {
        return factAmount;
    }

    public void setFactAmount(int factAmount) {
        this.factAmount = factAmount;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String printInfo(){
        return "Documentary: " + getTitle() + ", duration: " + getDuration() + ", director: " + getDirector() + ", theme: " + this.theme + ", fact amount: " + this.factAmount + ", event date: " + this.eventDate + "\n";
    }
}
