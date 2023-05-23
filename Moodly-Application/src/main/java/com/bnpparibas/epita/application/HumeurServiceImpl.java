package com.bnpparibas.epita.application;

import com.bnpparibas.epita.Humeur;
import com.bnpparibas.epita.IHumeur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
public class HumeurServiceImpl implements IHumeurService{

    @Autowired
    IHumeur daoHumeur;

    @Override
    public void createHumeur(Humeur h) {
        daoHumeur.save(h);
    }

    @Override
    public Humeur findById(Long idHumeur) {
        if(daoHumeur.findById(idHumeur).isPresent()){
            return daoHumeur.findById(idHumeur).get();
        }
        throw new EntityNotFoundException();

    }
}
