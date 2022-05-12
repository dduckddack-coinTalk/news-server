package com.example.news_sever.handler;

import com.example.news_sever.model.News;
import com.example.news_sever.service.NewsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class NewsHandler {

    private final NewsService newsService;

    public Mono<ServerResponse> HelloWorld(ServerRequest request) {
        return ServerResponse.ok()
                .body(Mono.just("Hello New!"), String.class);
    }

    public Mono<ServerResponse> findByEditor(ServerRequest request) {
        Mono<News> news = newsService.findByEditor("조은지")
                .log();

        return ServerResponse.ok()
                .body(news, News.class);
    }

    public Mono<ServerResponse> findAll(ServerRequest request) {
        Flux<News> news = newsService.findAll()
                .log();

        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(news, News.class);
    }

    public Mono<ServerResponse> save(ServerRequest serverRequest) {
        Mono<News> save = newsService.save(new News(null, "test", "test", "test", "test", "test", "test"));

        return ServerResponse.ok()
                .body(save, News.class);
    }
}
