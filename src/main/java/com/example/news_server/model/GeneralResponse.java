package com.example.news_server.model;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
public class GeneralResponse<T> {
    private String status;
    private T message;
}
