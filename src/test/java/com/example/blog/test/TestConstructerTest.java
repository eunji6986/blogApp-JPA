package com.example.blog.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.RequestParam;


@SpringBootTest
class TestConstructerTest {

    @Test
    @DisplayName("은지 테스트")
    public void test(@RequestParam(required = false) String name){



    }


}