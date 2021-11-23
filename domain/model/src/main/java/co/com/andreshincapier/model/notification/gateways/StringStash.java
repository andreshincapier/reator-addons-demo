package co.com.andreshincapier.model.notification.gateways;

import java.util.Set;
import reactor.core.publisher.Mono;

/**
 * Repo for storing key/value string data.
 */
public interface StringStash {

    /**
     * Saves a key-value in a repository
     * @param key key to store related value
     * @param value value to be stored
     * @return the same value stored.
     */
    Mono<String> save(String key, String value);

    /**
     * Gets a value from the store.
     * @param key the key to be obtainer
     * @return the string value stored under key
     */
    Mono<String> get(String key);

    Mono<Set<String>> keySet();

    Mono<Boolean> exists(String key);

    Mono<Boolean> evict(String key);

    Mono<Boolean> evictAll();

}

