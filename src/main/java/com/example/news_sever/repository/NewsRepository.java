package com.example.news_sever.repository;

import com.example.news_sever.model.News;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface NewsRepository extends ReactiveCrudRepository<News, String> {

    Mono<News> findTopByEditor(String editor);

}
