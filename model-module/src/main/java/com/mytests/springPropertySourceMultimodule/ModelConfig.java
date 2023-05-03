package com.mytests.springPropertySourceMultimodule;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

// the resource from the different module (that is not in this module classpath) is not resolved as propertySource
@Configuration
@ConfigurationPropertiesScan
@PropertySource({"classpath:app_model.properties","classpath:local_model.properties"})
public class ModelConfig {

    @Value("${extra.local-model.prop1}") // from this module:local_model.properties: ok
    String extra1;
    @Value("${extra.app-model.prop2}") // from app-module:app_model.properties: not resolved
    String extra2;
    @Value("${extra.application.prop3}")  // from app-module:application.properties: ok!
    String extra3;

    @Bean
    public ModelBean modelBean() {
        return new ModelBean(extra1 + ", " + extra2 + ", " +extra3);
    }
}
