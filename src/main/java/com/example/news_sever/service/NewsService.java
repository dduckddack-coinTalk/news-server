package com.example.news_sever.service;

import com.example.news_sever.model.News;
import com.example.news_sever.repository.NewsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
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
