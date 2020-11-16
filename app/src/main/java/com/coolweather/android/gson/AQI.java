package com.coolweather.android.gson;

/**
 * Created by Administrator on 2020/11/15.
 * 当前空气质量状况
 */

public class AQI {

    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
