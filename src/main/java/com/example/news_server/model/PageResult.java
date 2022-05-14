package com.example.news_server.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class PageResult<T> {
    private long totalElements;
    private long totalPages;
    private List<T> data;
}