package com.younesnaja.dyncv.controller;

import com.younesnaja.dyncv.dao.domain.impl.Personne;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;

@Configuration
public class MicroserviceConfiguration implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        HttpMethod[] unsupportedActions = {HttpMethod.DELETE, HttpMethod.POST, HttpMethod.PUT};

        config.getExposureConfiguration()
                .forDomainType(Personne.class)
                .withItemExposure((metdata, httpMethods) -> httpMethods.disable(unsupportedActions))
                .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(unsupportedActions));
    }
}
