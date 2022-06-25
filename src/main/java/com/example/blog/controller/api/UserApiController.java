package com.example.blog.controller.api;

import com.example.blog.dto.RespDto;
import com.example.blog.model.User;
import com.example.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;

@RestController
public class UserApiController {

    //@Service 어노테이션을 통해 IOC가 Bean등록을 해서
    //메모리에 띄워주면 우리가 DI해서 쓸 수 있다.
    @Autowired
    private UserService userService;

    @PostMapping("/api/user")
    public RespDto<Integer> save(@RequestBody User user){

        int result = userService.join(user);
        return new RespDto<Integer>(HttpStatus.OK, result);
    }
}
