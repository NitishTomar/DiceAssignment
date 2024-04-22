package com.example.forecast.controller;

import com.example.forecast.model.ForecastResponse;
import com.example.forecast.services.ForecastService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ForecastController {

    @Autowired
    private ForecastService forecastService;
    private static final Logger logger = LoggerFactory.getLogger(ForecastController.class);

    @GetMapping("/forecast/{locationName}/summary")
    public ResponseEntity<ForecastResponse> getForecastByLocation(@RequestHeader("RapidApplicationKey") String applicationKey, @PathVariable String locationName){
        ForecastResponse forecastResponse = forecastService.getHourlyForecastByLocation(applicationKey, locationName);
        logger.info("Forecast values for location : {}", forecastResponse.getLocationName());
        return ResponseEntity.status(HttpStatus.OK).body(forecastResponse);
    }

}
