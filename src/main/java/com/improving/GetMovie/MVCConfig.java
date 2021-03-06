package com.improving.GetMovie;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.w3c.dom.ls.LSOutput;

@Configuration
public class MVCConfig implements WebMvcConfigurer {


    @Bean
    public RestTemplate restTemplate (){
        return new RestTemplateBuilder().build();
    }

}
