package com.example.blog.test;

import com.example.blog.model.ConstructerTest;
import lombok.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class Test {

    @GetMapping("/paramTest")
    public String testJSP(@ModelAttribute ConstructerTest param){

        return param.toString();
    }
}
