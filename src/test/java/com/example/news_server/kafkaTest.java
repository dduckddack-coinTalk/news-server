package com.example.news_server;

import com.example.news_server.kafka.Producer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class kafkaTest {

    @Autowired
    private Producer producer;

    @Test
    void kafkaTest() {
        this.producer.sendMessage("kafka Test");
    }
}
