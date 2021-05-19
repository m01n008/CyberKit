package com.android.cyberkit.model;



import com.android.cyberkit.di.DaggerAPIComponent;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Single;

public class CountryService {
    @Inject
    CountryAPI api;
    {
        DaggerAPIComponent.builder().build().inject(this);
    }



    public Single<List<CountryPojo>> getCountries(){
        return api.getCountries();
    }
}
