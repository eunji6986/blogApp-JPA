package com.example.blog.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class RespDto<T> {
    //HTTP Response(응답) 때 공통적으로 쓸 Dto
    //HttpStatus는 Enum,  static으로 정해진 http 코드 바로 찾을수있어서 HttpStatus타입으로 설정
    HttpStatus status;
    T data;
}
