package com.example.news_sever;

import com.mongodb.reactivestreams.client.MongoClients;
import lombok.val;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.ReactiveMongoDatabaseFactory;
import org.springframework.data.mongodb.core.SimpleReactiveMongoDatabaseFactory;

import java.net.URI;

@SpringBootApplication
public class NewsSeverApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewsSeverApplication.class, args);
    }


}
