package com.github.rikseg.CitiesAPI.allRepositories;

import com.github.rikseg.CitiesAPI.cities.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CityRepository extends JpaRepository<City, Long> {

    @Query(value = "SELECT((SELECT lat_lon FROM cidade WHERE id = ?1) <@>(SELECT lat_lon FROM cidade WHERE id=?2)) AS distance;", nativeQuery = true)
    Double distanceByPoints(Long city1, Long city2);

    @Query(value = "SELECT earth_distance(ll_to_earth(?1,?2),ll_to_earth(?3,?4)) AS distance;", nativeQuery = true)
    Double distanceByCube(final Double x1, final Double y1, final Double x2, final Double y2);
}
