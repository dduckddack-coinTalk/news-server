package com.example.news_sever.repository;

import com.example.news_sever.model.News;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.server.ServerRequest;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface NewsRepository extends ReactiveCrudRepository<News, String> {

    Flux<News> findAllByTitleContainsOrderByCreatedAtDesc(String title, Pageable pageable);

}
