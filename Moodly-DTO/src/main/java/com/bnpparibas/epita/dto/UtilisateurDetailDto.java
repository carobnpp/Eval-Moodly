package com.bnpparibas.epita.dto;


import java.util.List;

public class UtilisateurDetailDto {

    private Long id;

    private String name;

    private String email;

    private List<ActiviteMinDto> activites;

    public UtilisateurDetailDto() {
    }

    public UtilisateurDetailDto(String name, String email, List<ActiviteMinDto> activites) {
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

    public List<ActiviteMinDto> getActivites() {
        return activites;
    }

    public void setActivites(List<ActiviteMinDto> activites) {
        this.activites = activites;
    }
}
