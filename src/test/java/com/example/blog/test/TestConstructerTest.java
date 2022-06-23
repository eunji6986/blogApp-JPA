package com.example.blog.test;

import com.example.blog.model.ConstructerTest;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;


@SpringBootTest
class TestConstructerTest {

    @Test
    @DisplayName("은지 테스트")
    public void test(){
        ConstructerTest t = new ConstructerTest();
        String name = "CuteJun";
        t.setName("eunji");
        assertThat(t.getName()).isEqualTo(name);// 시스템이 잘 컴파일 되는지 확인!
    }


}