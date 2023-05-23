package com.bnpparibas.epita;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.util.List;

@Entity
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    // un utilisateur peut avoir plusieurs activité. une activité peut avoir un seul utilisateur.
    // en cas de modification ou création d'un utilisateur, l'activité est mis à jour
    // en cas de chargement d'un utilisateur, sa liste d'activité est chargée - EAGER
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Activite> activites;

    public Utilisateur() {
    }

    public Utilisateur(Long id, String name, String email, List<Activite> activites) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.activites = activites;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Activite> getActivites() {
        return activites;
    }

    public void setActivites(List<Activite> activites) {
        this.activites = activites;
    }
}
