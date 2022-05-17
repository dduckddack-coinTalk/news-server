package com.example.news_server.service;

import com.example.news_server.model.News;
import com.example.news_server.model.PageResult;
import com.example.news_server.repository.NewsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class NewsService {

    private final NewsRepository newsRepository;

    public Mono<PageResult<News>> getPageableNewsByKeyword(String keyword, Pageable pageable) {

        return newsRepository.findAllByTitleContainsOrderByCreatedAtDesc(keyword, pageable)
                .collectList()
                .zipWith(newsRepository.countByTitleContainsOrderByCreatedAtDesc(keyword))
                .map(t -> {
                    long lastPage = (t.getT2()%pageable.getPageSize()>0) ? 0 : -1;
                    return new PageResult<News>(t.getT2(), t.getT2()/pageable.getPageSize() + lastPage , t.getT1());
                });


    }





}
