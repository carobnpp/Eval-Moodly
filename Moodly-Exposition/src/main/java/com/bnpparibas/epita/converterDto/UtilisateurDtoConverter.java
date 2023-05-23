package com.bnpparibas.epita.converterDto;

import com.bnpparibas.epita.Activite;
import com.bnpparibas.epita.Utilisateur;
import com.bnpparibas.epita.dto.ActiviteMinDto;
import com.bnpparibas.epita.dto.UtilisateurDetailDto;
import org.modelmapper.ModelMapper;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class UtilisateurDtoConverter {


    // utiliser pour créer un utilisateur
    public Utilisateur convertUtilisateurDetailDtoToEntity(UtilisateurDetailDto dto){
        ModelMapper mapper = new ModelMapper();
        return mapper.map(dto, Utilisateur.class);
    }

    // pour affichage d'un détail d'un utilisateur
    public static UtilisateurDetailDto convertEntityToUtilisateurDetailDto(Utilisateur user){
        UtilisateurDetailDto dto = new UtilisateurDetailDto();

        // vérifier si l'entité est présente
        dto.setId(user.getId());
        dto.setName(user.getName());
        dto.setEmail(user.getEmail());
        List<Activite> listActivite = new ArrayList<>();
        for (ActiviteMinDto activiteMinDto : dto.getActivites()){
            Activite activite = new Activite();
            activite.setDateActivite(activiteMinDto.getDateActivite());
            activite.setDuration(activiteMinDto.getDuration());
            activite.setName(activiteMinDto.getName());
        }

        return dto;
    }
}
