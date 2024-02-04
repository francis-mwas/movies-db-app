package com.fram.starwars.controllers;


import com.fram.starwars.dtos.FavouriteMovieDtoRequest;
import com.fram.starwars.service.FavMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/movies")
public class FavouriteMovieController {
    @Autowired
    private FavMovieService favMovieService;


    @PostMapping("/add")
    public long addNewMovie(@RequestBody FavouriteMovieDtoRequest favouriteMovieDtoRequest){
        long movieId = favMovieService.addFavouriteMovie(favouriteMovieDtoRequest);
        return movieId;
    }
}
