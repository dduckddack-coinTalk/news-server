package com.example.news_sever.handler;

import com.example.news_sever.model.News;
import com.example.news_sever.service.NewsService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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

    public Mono<ServerResponse> findAll(ServerRequest request) {
        String page = request.queryParam("page").orElse("0");
        String size = request.queryParam("size").orElse("20");
        String keyword = request.queryParam("keyword").orElse("");
        Pageable paging = PageRequest.of(Integer.parseInt(page), Integer.parseInt(size));

        Flux<News> news = newsService.findAllByTitleContainsOrderByCreatedAtDesc(keyword, paging);

        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(news, News.class);
    }


}
