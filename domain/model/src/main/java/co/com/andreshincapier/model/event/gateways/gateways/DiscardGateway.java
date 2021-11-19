package co.com.andreshincapier.model.event.gateways.gateways;

import co.com.andreshincapier.model.event.gateways.Subscription;
import reactor.core.publisher.Mono;

public interface DiscardGateway {
	Mono<Void> discardSubscription(Subscription subs);
}
