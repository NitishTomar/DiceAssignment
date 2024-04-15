package com.example.forecast.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Date;

public class ForecastResponse {
    public Location location;
    public Forecast forecast;

    public String getLocationName() {
        return location.name;
    }
}


class Astronomy{
    public Date dawn;
    public Date sunrise;
    public Date suntransit;
    public Date sunset;
    public Date dusk;
    public Date moonrise;
    public Date moontransit;
    public Date moonset;
    public int moonphase;
    public int moonzodiac;
}

class Coordinates{
    public double latitude;
    public double longitude;
}

class Forecast{
    public ArrayList<Item> items;
    public Date forecastDate;
    public Date nextUpdate;
    public String source;
    public String point;
    public String fingerprint;
}

class Gusts{
    public int value;
    public Object text;
}

class Item{
    public String date;
    public Date dateWithTimezone;
    public int freshSnow;
    public Object snowHeight;
    public Weather weather;
    public Prec prec;
    public int sunHours;
    public Object rainHours;
    public Temperature temperature;
    public Wind wind;
    public Windchill windchill;
    public SnowLine snowLine;
    public Astronomy astronomy;
}

class Location{
    public String code;
    public String name;
    public String timezone;
    public Coordinates coordinates;
}

class Prec{
    public double sum;
    public int probability;
    public Object sumAsRain;
    @JsonProperty("class")
    public int myclass;
}

class Root{
    public Location location;
    public Forecast forecast;
}

class SnowLine{
    public Object avg;
    public Object min;
    public Object max;
    public String unit;
}

class Temperature{
    public int min;
    public int max;
    public Object avg;
}

class Weather{
    public int state;
    public String text;
    public String icon;
}

class Wind{
    public String unit;
    public String direction;
    public String text;
    public Object avg;
    public int min;
    public int max;
    public Gusts gusts;
    public boolean significationWind;
}

class Windchill{
    public int min;
    public int max;
    public Object avg;
}



