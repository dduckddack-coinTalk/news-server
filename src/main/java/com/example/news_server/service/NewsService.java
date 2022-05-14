package com.example.news_server.service;

import com.example.news_server.repository.NewsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class NewsService {

    private final NewsRepository newsRepository;

    public Mono<PageImpl> findAllByTitleContainsOrderByCreatedAtDesc(String keyword, Pageable pageable) {

        return newsRepository.findAllByTitleContainsOrderByCreatedAtDesc(keyword, pageable)
                .collectList()
                .zipWith(newsRepository.countByTitleContainsOrderByCreatedAtDesc(keyword))
                .map(t -> new PageImpl(t.getT1(), pageable, t.getT2()));


    }


}
