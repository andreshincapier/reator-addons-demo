//package co.com.andreshincapier.redis;
//
//import co.com.andreshincapier.model.notification.gateways.Stash;
//import io.lettuce.core.RedisClient;
//import io.lettuce.core.api.reactive.RedisReactiveCommands;
//import java.util.Map;
//import java.util.Set;
//import org.apache.commons.lang3.StringUtils;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import reactor.core.publisher.Mono;
//
//@Configuration
//public class RedisStash implements Stash {
//
//    private static final String ERROR_KEY_MSG = "Caching key cannot be null";
//
//    private final RedisReactiveCommands<String, String> redisReactiveCommands;
//    private final int expireAfter = 10;
//
//    private RedisStash(RedisReactiveCommands<String, String> redisReactiveCommands,
//        int expireAfter) {
//        this.redisReactiveCommands = redisReactiveCommands;
//        this.expireAfter = expireAfter;
//    }
//
//    @Override
//    public Mono<String> save(String key, String value) {
//        return null;
//    }
//
//    @Override
//    public Mono<String> get(String key) {
//        return null;
//    }
//
//    @Override
//    public Mono<Set<String>> keySet() {
//        return null;
//    }
//
//    @Override
//    public Mono<Boolean> exists(String key) {
//        return null;
//    }
//
//    @Override
//    public Mono<Boolean> evict(String key) {
//        return null;
//    }
//
//    @Override
//    public Mono<Boolean> evictAll() {
//        return null;
//    }
//
//    @Override
//    public Mono<Map<String, String>> hSave(String key, Map<String, String> value) {
//        return null;
//    }
//
//    @Override
//    public Mono<String> hSave(String key, String field, String value) {
//        return null;
//    }
//
//    @Override
//    public Mono<String> hGet(String key, String field) {
//        return null;
//    }
//
//    @Override
//    public Mono<Map<String, String>> hGetAll(String key) {
//        return null;
//    }
//
//    @Override
//    public Mono<Boolean> hDelete(String key, String field) {
//        return null;
//    }
//
//    @Override
//    public Mono<Boolean> hDelete(String key) {
//        return null;
//    }
//
//    public static final class Builder {
//
//        private String host;
//        private int port = 6379;
//        private int database = 0;
//        private String password;
//        private int expireAfter = 300; // seconds
//
//        public Builder expireAfter(int seconds) {
//            this.expireAfter = seconds;
//            return this;
//        }
//
//        public Builder host(String host) {
//            this.host = host;
//            return this;
//        }
//
//        public Builder port(int port) {
//            this.port = port;
//            return this;
//        }
//
//        public Builder db(int db) {
//            this.database = db;
//            return this;
//        }
//
//        public Builder password(String password) {
//            this.password = password;
//            return this;
//        }
//
//        private String buildUrl() {
//            StringBuilder buffer = new StringBuilder();
//            buffer.append("redis://");
//            if (StringUtils.isNotBlank(this.password)) {
//                buffer.append(this.password);
//                buffer.append("@");
//            }
//            if (StringUtils.isNotBlank(this.host)) {
//                buffer.append(this.host);
//            } else {
//                buffer.append("localhost");
//            }
//            buffer.append(":");
//            buffer.append(this.port);
//            if (this.database > 0) {
//                buffer.append("/");
//                buffer.append(this.database);
//            }
//            return buffer.toString();
//        }
//
//        public RedisStash build() {
//            RedisClient redisClient = RedisClient.create(this.buildUrl());
//            RedisReactiveCommands<String, String> commands = redisClient.connect().reactive();
//            return new RedisStash(commands, this.expireAfter);
//        }
//    }
//
//
//}
