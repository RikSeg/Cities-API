package com.github.rikseg.CitiesAPI.allRepositories;

import com.github.rikseg.CitiesAPI.cities.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
