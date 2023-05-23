package com.bnpparibas.epita.dto;

import com.bnpparibas.epita.Utilisateur;

import java.time.LocalDate;

public class HumeurDetailDto {

    private Long id;

    private Utilisateur user;

    private boolean mood;

    private String description;

    private LocalDate dateHumeur;

    public HumeurDetailDto() {
    }

    public HumeurDetailDto(Utilisateur user, boolean mood, String description, LocalDate dateHumeur) {
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
