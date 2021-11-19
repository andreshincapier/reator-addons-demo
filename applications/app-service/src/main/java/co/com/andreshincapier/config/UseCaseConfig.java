package co.com.andreshincapier.config;

import co.com.andreshincapier.model.event.gateways.gateways.DiscardGateway;
import co.com.andreshincapier.usecase.DiscardSubscriptionUseCase;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

	@Bean
	public DiscardSubscriptionUseCase createDiscardSubscription(DiscardGateway gateway){
		return new DiscardSubscriptionUseCase(gateway);
	}
}
