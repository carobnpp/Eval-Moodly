package com.bnpparibas.epita.application;

import com.bnpparibas.epita.Humeur;

public interface IHumeurService {

    void createHumeur (Humeur h);

    Humeur findById(Long idHumeur);
}
