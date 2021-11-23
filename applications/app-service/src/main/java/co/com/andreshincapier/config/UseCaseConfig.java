package co.com.andreshincapier.config;

import co.com.andreshincapier.model.mutants.MutantsRepository;
import co.com.andreshincapier.usecase.DiscardSubscriptionUseCase;
import org.reactivecommons.utils.ObjectMapper;
import org.reactivecommons.utils.ObjectMapperImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapperImp();
    }

    @Bean
    public DiscardSubscriptionUseCase createDiscardSubscription(
        MutantsRepository mutantsRepository) {
        return new DiscardSubscriptionUseCase(mutantsRepository);
    }
}
