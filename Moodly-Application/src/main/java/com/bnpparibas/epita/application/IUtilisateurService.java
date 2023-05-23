package com.bnpparibas.epita.application;

import com.bnpparibas.epita.Utilisateur;

public interface IUtilisateurService {

    void createUser (Utilisateur u);

    Utilisateur findById(Long idUser);

}

