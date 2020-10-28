package com.dockerapp.citydates.lab4.controller;

import com.dockerapp.citydates.lab4.model.CityDates;
import javafx.util.Pair;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.time.ZonedDateTime;
import java.util.List;

@RestController
public class DatesController {

    private final CityDates cityDates;

    public DatesController(CityDates cityDates) {
        this.cityDates = cityDates;
    }

    @GetMapping("/getDatesM")
    public ResponseEntity<CityDates> getDatesM(){
        return ResponseEntity.ok(cityDates);
    }
}
