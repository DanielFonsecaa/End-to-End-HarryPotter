package io.codeforall.bootcamp.harrypotter.persistence.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "book")
public class Book extends AbstractModel {

    @Column(nullable = false)
    private String title;

    @Column
    private LocalDate releaseDate;

    @Column
    private String author;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Recipient{" +
                "title='" + title + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", author='" + author + '\'' +
                "} " + super.toString();
    }
}