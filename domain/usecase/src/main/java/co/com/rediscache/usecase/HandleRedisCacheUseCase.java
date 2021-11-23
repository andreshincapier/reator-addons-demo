package co.com.rediscache.usecase;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@Slf4j
@RequiredArgsConstructor
public class HandleRedisCacheUseCase {

    public Mono<Void> subscribe() {
        log.info("HERE IS INFO");
        return Mono.empty();
    }
}
