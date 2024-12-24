package dev.shanku.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "theatres")
public class Theatre extends BaseModel{
    private String theatreName;
    private String theatreAddress;
    //private String theatreCity;
    @OneToMany
    private List<Screen> screens;
}
