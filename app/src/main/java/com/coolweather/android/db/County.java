package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by admin on 2017/1/3.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;  //县级名称
    private String weatherId; //天气Id
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
