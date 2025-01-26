package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;

import lombok.Data;

@Data
public class GameDTO {
    
    private long id;
    private String title;
    private Integer year;
    private String genre;
    private String platforms;
    private String score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    public GameDTO() {
    }

    public GameDTO(Game entity) {
        //Esta classe Beanutils tem um metodo copyproperties
        //este metodo (origem e destino) estou copiando a entidade para o objeto DTO
        //BeanUtils.copyProperties(entity, this);

        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        genre = entity.getGenre();
        platforms = entity.getPlatforms();
        score = entity.getScore();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
        longDescription = entity.getLongDescription();
    }
}
