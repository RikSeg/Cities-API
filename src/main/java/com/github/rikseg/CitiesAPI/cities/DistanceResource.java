package com.github.rikseg.CitiesAPI.cities;


import com.github.rikseg.CitiesAPI.cities.service.DistanceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/distances")
public class DistanceResource {


    Logger log = LoggerFactory.getLogger(DistanceResource.class);

    private final DistanceService service;

    public DistanceResource(DistanceService service){
        this.service=service;
    }

    @GetMapping("/points_calc")
    public ResponseEntity byPoints(@RequestParam(name = "from") final Long city1, @RequestParam(name = "to") final Long city2){
        log.info("byPoints");
        return ResponseEntity.ok().body(service.distanceByPointsInMiles(city1,city2));
    }

    @GetMapping("/cube_calc")
    public ResponseEntity byCube(@RequestParam(name = "from") final Long city1, @RequestParam(name = "to") final Long city2){
        log.info("byCube");
        return ResponseEntity.ok().body(service.distanceByCubeInMeters(city1,city2));
    }
}
