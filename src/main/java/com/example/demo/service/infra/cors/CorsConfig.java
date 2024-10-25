package com.example.demo.service.infra.cors;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
            .allowedOrigins("http://localhost:3000", "https://surd-tech-front-end.vercel.app")
            .allowedMethods("GET", "POST", "PUT", "DELETE", "PATCH");
           // .allowedHeaders("*") 
           // .allowCredentials(true);
    }
}
