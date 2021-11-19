package co.com.andreshincapier.dynamodbfallback;

import co.com.andreshincapier.model.event.gateways.Subscription;
import co.com.andreshincapier.model.event.gateways.gateways.DiscardGateway;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class DynamoFallback implements DiscardGateway {

    @Override
    public Mono<Void> discardSubscription(Subscription subs) {
        // dynamodb logic to save subscription
        System.out.println("Mensaje descartado, procesando en DynamoDB");
        return Mono.empty();
    }
}
