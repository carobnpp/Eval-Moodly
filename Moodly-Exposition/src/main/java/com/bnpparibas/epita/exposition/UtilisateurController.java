package com.bnpparibas.epita.exposition;

import com.bnpparibas.epita.Utilisateur;
import com.bnpparibas.epita.application.IUtilisateurService;
import com.bnpparibas.epita.converterDto.UtilisateurDtoConverter;
import com.bnpparibas.epita.dto.UtilisateurDetailDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UtilisateurController {

    @Autowired
    IUtilisateurService serviceUtilisateur;

    @Autowired
    UtilisateurDtoConverter utilisateurConvert;

    @PostMapping("/users")
    public void createNewUtilisateur(@RequestBody UtilisateurDetailDto u){
        serviceUtilisateur.createUser(utilisateurConvert.convertUtilisateurDetailDtoToEntity(u));
    }

    @GetMapping("/users/{id}")
    public UtilisateurDetailDto findClientById(@PathVariable("id") Long id){
        Utilisateur u = serviceUtilisateur.findById(id);
        return UtilisateurDtoConverter.convertEntityToUtilisateurDetailDto(u);
    }

}
