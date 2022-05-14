package com.example.news_server.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "news")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class News {

    @Id
    private String id;
    private String createdAt;
    private String editor;
    private String imgUrl;
    private String summary;
    private String title;
    private String url;

}
