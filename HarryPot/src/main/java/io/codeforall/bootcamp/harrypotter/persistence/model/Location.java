package io.codeforall.bootcamp.harrypotter.persistence.model;

import javax.persistence.*;

@Entity
@Table(name = "location")
public class Location extends AbstractModel {


    @Column(nullable = false)
    private String name;

    @Column
    private String description;

    @Column(name = "image")
    private String imageUrl;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Recipient{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                "} " + super.toString();
    }
}