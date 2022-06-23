package com.example.blog.test;

import com.example.blog.model.ConstructerTest;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.RequestParam;

import static org.assertj.core.api.Assertions.*;


@SpringBootTest
class TestConstructerTest {

    @Test
    @DisplayName("은지 테스트")
    public void test(@RequestParam(required = false) String name){

        name="test";



        new ConstructerTest("test","test","test2");

    }


}