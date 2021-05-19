package com.android.cyberkit.di;

import com.android.cyberkit.model.CountryAPI;
import com.android.cyberkit.model.CountryService;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class APIModule {
    private String  BASE_URL = "";

    @Provides
     CountryAPI provideAPI(){

        return new Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build().create(CountryAPI.class);
    }

    @org.jetbrains.annotations.NotNull
    @org.jetbrains.annotations.Contract(" -> new")
    @Provides
     CountryService provideCountryService() {
        return new CountryService();
    }



}
