package com.example.blog.test;

import lombok.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Test {

    @GetMapping("/temp/jsp")
    public String testJSP(){
        //localhost:80/blog/WEB-INF/views/test.jsp
        return "test";
    }


}
