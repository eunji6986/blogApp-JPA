package com.example.blog.test;

import com.example.blog.model.RoleType;
import com.example.blog.model.User;
import com.example.blog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

@RestController
public class DummyControllerTest {

    @Autowired //UserRepository 타입으로 스프링이 관리하고 있는 객체가 있다면 userRepository에 넣어달라.
    private UserRepository userRepository;

    @GetMapping("dummy/users")
    public List<User> list(){
        return userRepository.findAll();
    }

    @GetMapping("/dummy/user")
    public List<User> pageList(@PageableDefault(size = 2,sort = "id",direction = Sort.Direction.DESC) Pageable pageable){
        List<User> users = userRepository.findAll(pageable).getContent();
        return users;

    }


    @GetMapping("/dummy/user/{id}")
    public User detail(@PathVariable int id){
//        User user = userRepository.findById(id).orElseThrow(new Supplier<IllegalArgumentException>() {
//            @Override
//            public IllegalArgumentException get() {
//                return new IllegalArgumentException("요청아이디 없음 id:" + id);
//            }
//        });
        User user = userRepository.findById(id).orElseThrow(()-> {
            return new IllegalArgumentException("요청하신 아이디가 없습니다. id : " + id);
        });
        return user;
        //Spring Boot Message Converter 작동
        //json 자동응답 (개발자가 json 라이브러리로 개별변환 안해줘도 됨)
    }

    @PostMapping("/dummy/join")
    public String join(User user){
        user.setRole(RoleType.USER);
        userRepository.save(user);
        return "회원가입완료"+user.toString();
    }


}
