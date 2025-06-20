package com.example.demo.Config;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class corsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // apply to all endpoints
                .allowedOrigins("http://localhost:5173")
                .allowedMethods("*") // allow all HTTP methods
                .allowedHeaders("*")
                .allowCredentials(true); // if you're using cookies or authorization headers
    }
}

