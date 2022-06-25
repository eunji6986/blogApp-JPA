package com.example.blog.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TilesTestController {
    private static final Logger log = LoggerFactory.getLogger(TilesTestController.class);

    @GetMapping("/main")
    public String main(){
        log.info("####main#####");
        return "member/index";
    }
}