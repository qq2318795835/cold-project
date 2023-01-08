package com.datamacy.coldgetway.commom;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GetWayConfig {
    @Bean
    public TokenFilter tokenFilter(){
        return new TokenFilter();
    }
}
