package com.raulproject.dslist.dto;


import com.raulproject.dslist.entities.Game;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

@Data
@NoArgsConstructor
public class GameDTO {

    private Long id;
    private String title;
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;

    public GameDTO(Game entity){
        BeanUtils.copyProperties(entity, this);
    }


}
