package com.android.cyberkit.model;

import com.google.gson.annotations.SerializedName;

public class CountryPojo {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }


    @SerializedName("name")
    private String name;
    @SerializedName("capital")
    private String capital;
    @SerializedName("flagPNG")
    private String flag;


}
