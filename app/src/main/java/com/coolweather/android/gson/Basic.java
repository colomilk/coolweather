package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2020/11/15.
 * 城市基本信息
 */

public class Basic {

    @SerializedName("city")         // 让JSON 宇段和 Java 字段之间建立映射关系。
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
