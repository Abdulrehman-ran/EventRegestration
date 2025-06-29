
package model;

import java.time.LocalDate;

public class Event {
    private String title, description;
    private LocalDate date;

    public Event(String title, String description, LocalDate date) {
        this.title = title;
        this.description = description;
        this.date = date;
    }

    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public LocalDate getDate() { return date; }
}