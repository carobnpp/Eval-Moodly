package com.bnpparibas.epita.converterDto;

import com.bnpparibas.epita.Activite;
import com.bnpparibas.epita.dto.ActiviteDetailDto;
import com.bnpparibas.epita.dto.ActiviteMinDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ActiviteDtoConverter {

    @Autowired
    HumeurDtoConverter humeurConvert;

    // utiliser pour créer une activité
    public static Activite convertActiviteDetailDtoToEntity(ActiviteDetailDto dto){
        ModelMapper mapper = new ModelMapper();
        return mapper.map(dto, Activite.class);
    }

    // pour affichage d'un détail d'une activité
    public static ActiviteDetailDto convertEntityToActiviteDetailDto(Activite activite){
        ActiviteDetailDto dto = new ActiviteDetailDto();

        dto.setId(activite.getId());
        dto.setDateActivite(activite.getDateActivite());
        dto.setName(activite.getName());
        dto.setDuration(activite.getDuration());
        dto.setUser(activite.getUser());
        dto.setHumeur(activite.getHumeur());
        return dto;
    }

    public  ActiviteMinDto convertEntityToActiviteMinDto(Activite activite){
        ActiviteMinDto dto = new ActiviteMinDto();
        dto.setId(activite.getId());
        dto.setDateActivite(activite.getDateActivite());
        dto.setName(activite.getName());
        dto.setDuration(activite.getDuration());
        dto.setHumeur(humeurConvert.convertEntityToHumeurMinDto(activite.getHumeur()));
        return dto;
    }
}
