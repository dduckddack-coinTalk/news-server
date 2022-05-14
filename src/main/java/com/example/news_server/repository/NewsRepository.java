package com.example.news_server.repository;

import com.example.news_server.model.News;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface NewsRepository extends ReactiveCrudRepository<News, String> {

    Flux<News> findAllByTitleContainsOrderByCreatedAtDesc(String title, Pageable pageable);

    Mono<Long> countByTitleContainsOrderByCreatedAtDesc(String title);

}

