package co.com.andreshincapier.usecase;

import co.com.andreshincapier.model.event.gateways.Subscription;
import co.com.andreshincapier.model.event.gateways.gateways.DiscardGateway;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class DiscardSubscriptionUseCase {

	private final DiscardGateway discardGateway;

	public Mono<Void> notifyDiscard(Subscription subs){
		return discardGateway.discardSubscription(subs);
	}	
}
