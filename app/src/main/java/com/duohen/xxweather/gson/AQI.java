package com.duohen.xxweather.gson;

/**
 * Created by xiaoxin on 17-9-18.
 */

public class AQI {
    public AQICity city;
    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
