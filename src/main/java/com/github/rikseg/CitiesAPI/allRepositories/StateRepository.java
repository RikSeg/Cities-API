package com.github.rikseg.CitiesAPI.allRepositories;

import com.github.rikseg.CitiesAPI.states.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State,Long> {
}
