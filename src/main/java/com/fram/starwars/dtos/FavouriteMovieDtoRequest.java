package com.fram.starwars.dtos;

import lombok.Data;

@Data
public class FavouriteMovieDtoRequest {
    private String movieTpe;
    private String movieName;
    private String movieUrl;
}
