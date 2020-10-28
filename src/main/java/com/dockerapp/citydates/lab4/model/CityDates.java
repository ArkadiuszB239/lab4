package com.dockerapp.citydates.lab4.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.ZoneId;

@Component
@Data
public class CityDates {

    private LocalDateTime lublinDate;
    private LocalDateTime newYorkDate;
    private LocalDateTime sydneyDate;

    public CityDates() {
        this.lublinDate = LocalDateTime.now(ZoneId.of("Europe/Warsaw"));
        this.newYorkDate = LocalDateTime.now(ZoneId.of("America/New_York"));
        this.sydneyDate = LocalDateTime.now(ZoneId.of("Australia/Sydney"));
    }
}
