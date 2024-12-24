package dev.shanku.bookmyshow.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "movies")
public class Movie extends BaseModel{
    private String movie;
    private double rating;
}
