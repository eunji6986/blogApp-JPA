package com.example.blog.controller.api;

import com.example.blog.dto.RespDto;
import com.example.blog.model.Users;
import com.example.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import static com.example.blog.model.RoleType.USER;

@RestController
public class UserApiController {

    //@Service 어노테이션을 통해 IOC가 Bean등록을 해서
    //메모리에 띄워주면 우리가 DI해서 쓸 수 있다.
    @Autowired
    private UserService userService;

    @PostMapping("/api/user")
    public RespDto<Integer> save(@RequestBody Users user){
        System.out.println(user.toString());
        user.setRole(USER);
            userService.join(user);

        return new RespDto<Integer>(HttpStatus.OK.value(), 1);
    }


   @GetMapping("/api/user/{username}/exists")
    public ResponseEntity<Boolean> duplicateUsername(@PathVariable String username){
      return ResponseEntity.ok(userService.checkExistUsername(username));
   }

    @GetMapping("/api/user/{email}/exists")
    public ResponseEntity<Boolean> duplicateEmail(@PathVariable String email){
        return ResponseEntity.ok(userService.checkExistUsername(email));
    }

}
