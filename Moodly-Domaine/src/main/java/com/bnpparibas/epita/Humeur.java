package com.bnpparibas.epita;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Humeur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // ManyToOne- un utilisateur peut avoir plusieurs humeur.
    // en écriture, en cas de modification de l'humeur, je ne modifie pas l'utilisateur (pas de besoin de cascade)
    // en lecture,  je veux récupérer les données de l'utilisateur (OK car EAGER par défaut)
    @ManyToOne
    private Utilisateur user;

    private boolean mood;

    private String description;

    private LocalDate dateHumeur;

    public Humeur() {
    }

    public Humeur(Utilisateur user, boolean mood, String description, LocalDate dateHumeur) {
        this.user = user;
        this.mood = mood;
        this.description = description;
        this.dateHumeur = dateHumeur;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Utilisateur getUser() {
        return user;
    }

    public void setUser(Utilisateur user) {
        this.user = user;
    }

    public boolean isMood() {
        return mood;
    }

    public void setMood(boolean mood) {
        this.mood = mood;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDateHumeur() {
        return dateHumeur;
    }

    public void setDateHumeur(LocalDate dateHumeur) {
        this.dateHumeur = dateHumeur;
    }
}
