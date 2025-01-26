package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.GameList;

import lombok.Data;

@Data
public class GameListDTO {
    
    private Long id;
    private String name;

    public GameListDTO() {
    }

    public GameListDTO(GameList entity) {
        id = entity.getId();
        name = entity.getName();
    }
}
