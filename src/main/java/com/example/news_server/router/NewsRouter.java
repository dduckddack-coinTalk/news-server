package com.example.news_server.router;

import com.example.news_server.handler.NewsHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.path;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@RestController
public class NewsRouter {

    @Bean
    public RouterFunction<ServerResponse> router(NewsHandler newsHandler) {
        return route().nest(path("/news"), builder -> {
            builder.GET("/test",newsHandler::HelloWorld);
            builder.GET("",newsHandler::findAll);
        }).build();

    }
}
