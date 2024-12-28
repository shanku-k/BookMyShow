package dev.shanku.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
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
    @JoinColumn(name="theatreId")
    private List<Screen> screens;
}
