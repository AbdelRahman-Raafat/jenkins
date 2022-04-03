package com.opay.plugins.vodafone.config;

import com.opay.plugins.vodafone.PluginController;
import com.opay.plugins.vodafone.vodafone_topup.VodafoneTopupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource({"classpath:application.properties","${spring.config.location}"})
public class ApplicationConfiguration {

    @Autowired
    private Environment environment;

    @Bean
    public PluginController pluginController(){ return new PluginController(); }

    @Bean
    public VodafoneTopupService vodafoneTopupService(){
        return new VodafoneTopupService(environment);
    }
}
