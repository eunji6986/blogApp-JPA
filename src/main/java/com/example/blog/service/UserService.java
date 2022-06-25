package com.example.blog.service;

import com.example.blog.model.User;
import com.example.blog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service //ComponentScan (Bean 등록, IOC)
public class UserService {

    /*Service Package :
    1.트렌젝션 관리
    2.서비스의 의미 : 1개 혹은 여러개의 기능 로직이 묶여 하나의 서비스가 된다.
    두개의 트렌젝션을 하나의 트렌젝션으로 묶어서 서비스로 만들듯이.
    */


    @Autowired //DI
    UserRepository userRepository;

    @Transactional //join 내의 로직이 transaction으로 묶이게 된다
    public Integer join(User user) {
        try {
            userRepository.save(user); //save(Entity)
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("UserService 회원가입(): " + e.getMessage());
        }
        return -1;
    }
}
