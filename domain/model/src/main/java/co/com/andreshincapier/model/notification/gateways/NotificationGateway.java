package co.com.andreshincapier.model.notification.gateways;

import reactor.core.publisher.Mono;

public interface NotificationGateway {

    Mono<Void> sendNotification(String message);
}
