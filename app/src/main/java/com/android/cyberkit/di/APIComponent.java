package com.android.cyberkit.di;


import com.android.cyberkit.model.CountryService;

import dagger.Component;

@Component(modules = {APIModule.class})
public interface APIComponent {

    void inject(CountryService countryService);

}
