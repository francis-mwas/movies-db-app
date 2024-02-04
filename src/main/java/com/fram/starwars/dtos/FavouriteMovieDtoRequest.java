package com.fram.starwars.dtos;

import lombok.Data;

@Data
public class FavouriteMovieDtoRequest {
    private String type;
    private String name;
    private String url;
}
