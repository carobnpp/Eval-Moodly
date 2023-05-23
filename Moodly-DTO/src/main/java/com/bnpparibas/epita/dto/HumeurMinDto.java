package com.bnpparibas.epita.dto;


import java.time.LocalDate;

public class HumeurMinDto {

    private Long id;

    private boolean mood;

    private String description;

    private LocalDate dateHumeur;

    public HumeurMinDto() {
    }

    public HumeurMinDto(boolean mood, String description, LocalDate dateHumeur) {
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
