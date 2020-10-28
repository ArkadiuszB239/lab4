package com.dockerapp.citydates.lab4.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.ZoneId;

@Data
@AllArgsConstructor
public class CityDates {
    private LocalDateTime lublin;
    private LocalDateTime new_york;
    private LocalDateTime sydney;
}
