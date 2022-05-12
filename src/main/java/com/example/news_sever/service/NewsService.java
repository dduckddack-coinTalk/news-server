package com.example.news_sever.service;

import com.example.news_sever.model.News;
import com.example.news_sever.repository.NewsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class NewsService {

    private final NewsRepository newsRepository;

    public Mono<News> findByEditor(String name) {
        return newsRepository.findTopByEditor(name);
    }

    public Flux<News> findAll() {
        return newsRepository.findAll();
    }

    public Mono<News> save(News news) {
        return newsRepository.save(news);
    }

}
