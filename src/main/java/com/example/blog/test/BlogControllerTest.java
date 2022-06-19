package com.example.blog.test;

import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class BlogControllerTest {

    @GetMapping("/test")
    public String Hello(@RequestParam String name) {
        return "get요청: " + name;
    }

    @PostMapping("/test")
    public String HelloPost(@RequestBody String name) {
        return "post요청: " + name;
    }





}
