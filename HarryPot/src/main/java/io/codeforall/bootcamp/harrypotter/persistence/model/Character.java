package io.codeforall.bootcamp.harrypotter.persistence.model;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;


@Entity
@Table(name = "character")
public class Character extends AbstractModel {

    @Column(nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "house_id")
    private House house;

    @Column
    private LocalDate birthdate;

    @Column(name = "image")
    private String imageUrl;


    @Column
    private String gender;

    @ManyToMany
    @JoinTable(
            name = "character_spell",
            joinColumns = @JoinColumn(name = "character_id"),
            inverseJoinColumns = @JoinColumn(name = "spell_id")
    )
    private Set<Spell> spell;


    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Set<Spell> getSpell() {
        return spell;
    }

    public void setSpell(Set<Spell> spell) {
        this.spell = spell;
    }

    public Set<Spell> getSpells() {
        return spell;
    }

    public void setSpells(Set<Spell> spell) {
        this.spell = spell;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Recipient{" +
                "name='" + name + '\'' +
                ", spells='" + spell + '\'' +
                ", house='" + house + '\'' +
                ", birth date=" + birthdate +
                ", gender='" + gender + '\'' +
                "} " + super.toString();
    }
}
