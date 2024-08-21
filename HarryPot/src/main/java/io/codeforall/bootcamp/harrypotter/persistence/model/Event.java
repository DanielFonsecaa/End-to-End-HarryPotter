package io.codeforall.bootcamp.harrypotter.persistence.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "event")
public class Event extends AbstractModel {

    @Column(nullable = false)
    private String title;

    @Column
    private LocalDate date;

    @Column
    private String description;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Recipient{" +
                "title='" + title + '\'' +
                ", date='" + date + '\'' +
                ", description='" + description + '\'' +
                "} " + super.toString();
    }
}