package com.fram.starwars.service;

import com.fram.starwars.api.entity.FavouriteMovieEntity;
import com.fram.starwars.dtos.FavouriteMovieDtoRequest;
import com.fram.starwars.model.FavouriteMovieResponse;
import com.fram.starwars.repository.FavouriteMovieRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Log4j2
public class FavouriteMovieServiceImpl implements FavMovieService {

    @Autowired
    private FavouriteMovieRepository favouriteMovieRepository;


      @Override
    public long addFavouriteMovie(FavouriteMovieDtoRequest favouriteMovieDtoRequest) {
        log.info("Add new movie");
        FavouriteMovieEntity favouriteMovie =
                FavouriteMovieEntity.builder()
                                .movieName(favouriteMovieDtoRequest.getMovieName())
                                        .movieUrl(favouriteMovieDtoRequest.getMovieUrl())
                                                .movieType(favouriteMovieDtoRequest.getMovieUrl())
                                                        .build();
        favouriteMovieRepository.save(favouriteMovie);
        log.info("Movie created successfully: "+ favouriteMovie);
        return favouriteMovie.getMovieId();
    }

    @Override
    public FavouriteMovieResponse getFavouritesMovies() {
        return null;
    }
}
