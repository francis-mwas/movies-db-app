package com.fram.starwars.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FavouriteMovieEntity {
    @Id
    @GeneratedValue(
    strategy = GenerationType.AUTO
    )
    private long movieId;
    private String movieType;
    private String movieName;
    private String movieUrl;
}
