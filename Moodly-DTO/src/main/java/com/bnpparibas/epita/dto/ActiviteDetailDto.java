package com.bnpparibas.epita.dto;

import com.bnpparibas.epita.Humeur;
import com.bnpparibas.epita.Utilisateur;

import java.time.LocalDate;

public class ActiviteDetailDto {

    private Long id;

    private Utilisateur user;

    private String name;

    private int duration;

    private LocalDate dateActivite;

    private Humeur humeur;

    public ActiviteDetailDto() {
    }

    public ActiviteDetailDto(Utilisateur user, String name, int duration, LocalDate dateActivite, Humeur humeur) {
        this.user = user;
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

    public Utilisateur getUser() {
        return user;
    }

    public void setUser(Utilisateur user) {
        this.user = user;
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

    public Humeur getHumeur() {
        return humeur;
    }

    public void setHumeur(Humeur humeur) {
        this.humeur = humeur;
    }
}
