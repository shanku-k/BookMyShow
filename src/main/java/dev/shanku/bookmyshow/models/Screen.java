package dev.shanku.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "screens")
public class Screen extends BaseModel{
    private String name;

    @Enumerated(EnumType.ORDINAL)
    @ElementCollection
    private List<Feature> featureList;

    @OneToMany
    private List<Seat> seatList;

//    @ManyToOne
//    private Theatre theatre;
}
