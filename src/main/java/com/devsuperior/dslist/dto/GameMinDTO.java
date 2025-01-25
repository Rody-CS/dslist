package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;

import lombok.Data;

@Data
public class GameMinDTO {
    
    private long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO() {
    }

    //Construtor vai receber a entidade copiando os dados da entidade,
    //Vou instanciar o GameMinDTO apartir do Game, copiando o game para o dto
    public GameMinDTO(Game entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.year = entity.getYear();
        this.imgUrl = entity.getImgUrl();
        this.shortDescription = entity.getShortDescription();
    }
}
