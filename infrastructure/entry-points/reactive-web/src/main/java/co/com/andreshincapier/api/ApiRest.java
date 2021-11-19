package co.com.andreshincapier.api;

import co.com.andreshincapier.usecase.DiscardSubscriptionUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ApiRest {

    private final DiscardSubscriptionUseCase useCase;

    @PostMapping(path = "/subscribe")
    public Mono<Void> subscribe() {
        return Mono.empty();
    }
}
