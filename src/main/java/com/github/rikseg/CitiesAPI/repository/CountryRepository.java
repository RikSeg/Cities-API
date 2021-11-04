package com.github.rikseg.CitiesAPI.repository;

import com.github.rikseg.CitiesAPI.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository  extends JpaRepository<Country, Long> {
}
