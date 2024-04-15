package com.example.forecast.services;

import com.example.forecast.interfaces.ForecastRapidClient;
import com.example.forecast.model.ForecastResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ForecastService {
    @Autowired
    public ForecastRapidClient forecastRapidClient;

    public ForecastResponse getHourlyForecastByLocation(String applicationKey, String locationName){
            return forecastRapidClient.getHourlyForecastByLocationName(applicationKey, locationName);
    }
}
