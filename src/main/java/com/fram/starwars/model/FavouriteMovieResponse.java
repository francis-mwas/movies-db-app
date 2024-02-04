package com.fram.starwars.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FavouriteMovieResponse {
    private long movieId;
    private String type;
    private String name;
    private String url;
}

