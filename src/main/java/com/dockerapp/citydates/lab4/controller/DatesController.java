package com.dockerapp.citydates.lab4.controller;

import com.dockerapp.citydates.lab4.model.CityDates;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.ZoneId;


@Controller
public class DatesController {
    @GetMapping("/getDates")
    public ResponseEntity<CityDates> getDatesM(){
        CityDates cityDates = new CityDates(
                LocalDateTime.now(ZoneId.of("Europe/Warsaw")),
                LocalDateTime.now(ZoneId.of("America/New_York")),
                LocalDateTime.now(ZoneId.of("Australia/Sydney"))
        );
        return ResponseEntity.ok(cityDates);
    }

    @GetMapping("/getDatesS")
    public String getDatesS(Model model){
        CityDates cityDates = new CityDates(
                LocalDateTime.now(ZoneId.of("Europe/Warsaw")),
                LocalDateTime.now(ZoneId.of("America/New_York")),
                LocalDateTime.now(ZoneId.of("Australia/Sydney"))
        );

        model.addAttribute("lublinDate", cityDates.getLublin());
        model.addAttribute("newYorkDate", cityDates.getNew_york());
        model.addAttribute("sydneyDate", cityDates.getSydney());
        return "dates";
    }
}
