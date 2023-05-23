package com.bnpparibas.epita.application;

import com.bnpparibas.epita.IUtilisateur;
import com.bnpparibas.epita.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
public class UtilisateurServiceImpl implements IUtilisateurService{

@Autowired
    IUtilisateur daoUtilisateur;

    @Override
    public void createUser(Utilisateur u) {
        daoUtilisateur.save(u);

    }

    @Override
    public Utilisateur findById(Long idUser) {
        if(daoUtilisateur.findById(idUser).isPresent()){
            return daoUtilisateur.findById(idUser).get();
        }
        throw new EntityNotFoundException();
    }
}
