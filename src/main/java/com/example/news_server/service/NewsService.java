package com.example.news_server.service;

import com.example.news_server.model.News;
import com.example.news_server.repository.NewsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
@Service
public class NewsService {

    private final NewsRepository newsRepository;

    public Flux<News> findAllByTitleContainsOrderByCreatedAtDesc(String keyword, Pageable pageable) {

        return newsRepository.findAllByTitleContainsOrderByCreatedAtDesc(keyword, pageable);

    }


}
