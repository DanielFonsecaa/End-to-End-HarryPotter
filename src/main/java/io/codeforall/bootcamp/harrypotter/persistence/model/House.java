package io.codeforall.bootcamp.harrypotter.persistence.model;

import javax.persistence.*;


@Entity
@Table(name = "house")
public class House extends AbstractModel {

    @Column(nullable = false)
    private String name;

    @Column
    private String founder;

    @Column
    private String ghost;

    @Column
    private String mascot;

    @Column
    private String colors;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFounder() {
        return founder;
    }

    public void setFounder(String founder) {
        this.founder = founder;
    }

    public String getGhost() {
        return ghost;
    }

    public void setGhost(String ghost) {
        this.ghost = ghost;
    }

    public String getMascot() {
        return mascot;
    }

    public void setMascot(String mascot) {
        this.mascot = mascot;
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    @Override
    public String toString() {
        return "Recipient{" +
                "name='" + name + '\'' +
                ", founder='" + founder + '\'' +
                ", ghost='" + ghost + '\'' +
                ", mascot='" + mascot + '\'' +
                ", colors='" + colors + '\'' +
                "} " + super.toString();
    }
}
