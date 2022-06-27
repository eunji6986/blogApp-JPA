package com.example.blog.repository;

import com.example.blog.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface UserRepository extends JpaRepository<Users,Integer> {

    boolean existsByUsername(String username);
    boolean existsByEmail(String email);

}
