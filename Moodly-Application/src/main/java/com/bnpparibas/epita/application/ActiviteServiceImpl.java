package com.bnpparibas.epita.application;

import com.bnpparibas.epita.Activite;
import com.bnpparibas.epita.IActivite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
public class ActiviteServiceImpl implements IActiviteService{

    @Autowired
    IActivite daoActivite;

    @Override
    public void createActivité(Activite a) {
        daoActivite.save(a);
    }

    @Override
    public Activite findById(Long idActivite) {
        if(daoActivite.findById(idActivite).isPresent()){
            return daoActivite.findById(idActivite).get();
        }
        throw new EntityNotFoundException();
    }
}
