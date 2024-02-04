package com.fram.starwars.repository;

import com.fram.starwars.api.entity.FavouriteMovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavouriteMovieRepository extends JpaRepository<FavouriteMovieEntity, Long> {
}
