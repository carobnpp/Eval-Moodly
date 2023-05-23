package com.bnpparibas.epita.dto;


import java.time.LocalDate;

public class ActiviteMinDto {

    private Long id;

    private String name;

    private int duration;

    private LocalDate dateActivite;

    private HumeurMinDto humeur;

    public ActiviteMinDto() {
    }

    public ActiviteMinDto(String name, int duration, LocalDate dateActivite, HumeurMinDto humeur) {
        this.name = name;
        this.duration = duration;
        this.dateActivite = dateActivite;
        this.humeur = humeur;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public LocalDate getDateActivite() {
        return dateActivite;
    }

    public void setDateActivite(LocalDate dateActivite) {
        this.dateActivite = dateActivite;
    }

    public HumeurMinDto getHumeur() {
        return humeur;
    }

    public void setHumeur(HumeurMinDto humeur) {
        this.humeur = humeur;
    }
}
