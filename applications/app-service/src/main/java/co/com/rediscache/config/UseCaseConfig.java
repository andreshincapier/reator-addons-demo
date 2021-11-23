package co.com.rediscache.config;

import co.com.rediscache.usecase.HandleRedisCacheUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Bean
    public HandleRedisCacheUseCase handleRedisCacheUseCase() {
        return new HandleRedisCacheUseCase();
    }
}
