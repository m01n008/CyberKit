package com.android.cyberkit.model;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.GET;

public interface CountryAPI {

    @GET("DevTides/countries/master/countriesV2.json")
    Single<List<CountryPojo>> getCountries();

}
