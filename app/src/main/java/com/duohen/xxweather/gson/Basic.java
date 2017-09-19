package com.duohen.xxweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by xiaoxin on 17-9-18.
 * 为了json数据中的：
 * "basic":{
 *      "city":"常州"
 *      "id":"CN101190401"
 *      "update":"{
 *          "loc":"2016-08-08 21:58"
 *      }}
 *  使用@SerializedName注解的方式让JSON与Java字段之间建立映射关系
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;
    }
}
