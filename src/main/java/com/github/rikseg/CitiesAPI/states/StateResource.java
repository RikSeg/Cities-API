package com.github.rikseg.CitiesAPI.states;


import com.github.rikseg.CitiesAPI.allRepositories.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/states")
public class StateResource {

    @Autowired
    private StateRepository repository;

    @GetMapping
    public Page<State> states(Pageable page) {

        return repository.findAll(page);
    }

}
