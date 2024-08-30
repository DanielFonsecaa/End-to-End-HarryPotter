package io.codeforall.bootcamp.harrypotter.persistence.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "spell")
public class Spell extends AbstractModel {

    @Column(nullable = false)
    private String name;

    @Column
    private String effect;

    @Column
    private String incantation;

    @ManyToMany(mappedBy = "spell")
    private Set<Character> character;


    public Set<Character> getCharacters() {
        return character;
    }

    public void setCharacters(Set<Character> character) {
        this.character = character;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public String getIncantation() {
        return incantation;
    }

    public void setIncantation(String incantation) {
        this.incantation = incantation;
    }

    @Override
    public String toString() {
        return "Recipient{" +
                "name='" + name + '\'' +
                ", characters='" + character + '\'' +
                ", effect='" + effect + '\'' +
                ", incantation='" + incantation + '\'' +
                "} " + super.toString();
    }
}