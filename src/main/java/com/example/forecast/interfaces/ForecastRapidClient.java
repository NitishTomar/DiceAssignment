package com.example.forecast.interfaces;

import com.example.forecast.model.ForecastResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;


@FeignClient(name = "forecast", url = "https://forecast9.p.rapidapi.com/rapidapi")
public interface ForecastRapidClient {
    @GetMapping("/forecast/{locationName}/summary/")
    ForecastResponse getHourlyForecastByLocationName(@RequestHeader("X-Rapidapi-Key") String rapidApiKey,
                                                     @PathVariable("locationName") String locationName);

}
