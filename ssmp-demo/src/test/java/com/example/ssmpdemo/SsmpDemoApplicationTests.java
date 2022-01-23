package com.example.ssmpdemo;

import com.example.ssmpdemo.mapper.BookMapper;
import com.example.ssmpdemo.pojo.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SsmpDemoApplicationTests {

    @Autowired
    private BookMapper dao;
    @Test
    void contextLoads() {
        Book select = dao.select(1);
        System.out.println(select);
    }

}
