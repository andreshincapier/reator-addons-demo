package co.com.andreshincapier.api;

import co.com.andreshincapier.model.mutants.Mutants;
import co.com.andreshincapier.usecase.DiscardSubscriptionUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ApiRest {

    private final DiscardSubscriptionUseCase useCase;

    @GetMapping(path = "/mutants")
    public Flux<Mutants> findAllResults() {
        return useCase.findAllResults();
    }

    @GetMapping(path = "/mutant/{id}")
    public Mono<Mutants> findResultById(@PathVariable("id") String id) {
        return useCase.findResultById(id);
    }
}
