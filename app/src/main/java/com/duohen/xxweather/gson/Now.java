package com.duohen.xxweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by xiaoxin on 17-9-18.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
