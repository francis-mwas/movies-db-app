package com.fram.starwars.service;

import com.fram.starwars.dtos.FavouriteMovieDtoRequest;
import com.fram.starwars.model.FavouriteMovieResponse;

public interface FavMovieService {
    long addFavouriteMovie(FavouriteMovieDtoRequest favouriteMovieDtoRequest);
    FavouriteMovieResponse getFavouritesMovies();
}
