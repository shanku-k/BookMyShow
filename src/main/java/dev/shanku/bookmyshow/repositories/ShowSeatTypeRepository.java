package dev.shanku.bookmyshow.repositories;

import dev.shanku.bookmyshow.models.Show;
import dev.shanku.bookmyshow.models.ShowSeatType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ShowSeatTypeRepository extends JpaRepository<ShowSeatType, Long> {

    //select * from show_seat_type where show_id = 123.
    /*

    123 GOLD 500
    123 SILVER 300
    123 PLATINUM 700
    123 RECLINER 800

     */
    List<ShowSeatType> findAllByShow(Show show);
}
