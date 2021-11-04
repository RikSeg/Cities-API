package com.github.rikseg.CitiesAPI;


import com.github.rikseg.CitiesAPI.countries.Country;
import com.github.rikseg.CitiesAPI.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/countries") //on localhost:8080/countries it will bring all countries on Database's "Pais" table in json format
public class CountryResource {

    @Autowired
    private CountryRepository repository;

    @GetMapping
    public Page<Country> countries(Pageable page) {

        return repository.findAll(page);
    }
}
