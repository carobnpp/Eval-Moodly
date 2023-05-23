package com.bnpparibas.epita.converterDto;


import com.bnpparibas.epita.Humeur;

import com.bnpparibas.epita.dto.HumeurDetailDto;
import com.bnpparibas.epita.dto.HumeurMinDto;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;


@Component
public class HumeurDtoConverter {

    // utiliser pour créer une humeur
    public static Humeur convertHumeurDetailDtoToEntity(HumeurDetailDto dto){
        ModelMapper mapper = new ModelMapper();
        return mapper.map(dto, Humeur.class);
    }

    // pour affichage d'un détail d'une humeur
    public static HumeurDetailDto convertEntityToHumeurDetailDto(Humeur humeur){
        HumeurDetailDto dto = new HumeurDetailDto();

        dto.setId(humeur.getId());
        dto.setDescription(humeur.getDescription());
        dto.setDateHumeur(humeur.getDateHumeur());
        dto.setMood(humeur.isMood());
        dto.setUser(humeur.getUser());
        return dto;
    }

    public  HumeurMinDto convertEntityToHumeurMinDto(Humeur humeur){
        HumeurMinDto dto = new HumeurMinDto();
        dto.setId(humeur.getId());
        dto.setDescription(humeur.getDescription());
        dto.setDateHumeur(humeur.getDateHumeur());
        dto.setMood(humeur.isMood());
        return dto;
    }

}
