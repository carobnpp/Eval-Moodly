package com.bnpparibas.epita;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Activite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // utilisateur aui a crée l'activité - un utilisateur peut avoir créer plusieurs activités
    // en écriture, si je modifie l'activité je ne modifie pas l'utilisateur (pas besoin de cascade)
    //en lecture, je veux récupérer les données des utilisateurs (EAGER est par défaut)
    @ManyToOne
    private Utilisateur user;

    private String name;

    private int duration;

    private LocalDate dateActivite;

    // une activité peut avoir une seule humeur.  une humeur peut avoir une seule activité
    // en cas de modification ou création d'une humeur, je ne modifie pas l'humeur
    // en cas de chargement, chargement de l'humeur - EAGER
    @OneToOne
    private Humeur humeur;

    public Activite() {
    }

    public Activite(Utilisateur user, String name, int duration, LocalDate dateActivite, Humeur humeur) {
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
