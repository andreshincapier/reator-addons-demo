package co.com.andreshincapier.model.event.gateways.gateways;

import co.com.andreshincapier.model.event.gateways.Subscription;
import reactor.core.publisher.Mono;

public interface SubscriptionGateway {
	Mono<Void> subscribeEnterpriseAsync(Subscription subsc);
}
