package com.bnpparibas.epita.application;

import com.bnpparibas.epita.Activite;
import com.bnpparibas.epita.Utilisateur;

public interface IActiviteService {

    void createActivité  (Activite a);

    Activite findById(Long idActivite);
}
