package com.example.blog.model;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.sql.Timestamp;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
//@DynamicInsert insert시에 null필드 제외 default값 들어갈 수 있도록
@ToString
@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //프로젝트와 연결된 DB의 넘버링 방법을 따라가기로 한다
    private int id;

    @Column(nullable = false,length = 30,unique = true)
    private String username;

    @Size(min = 8,max = 20,message = "비밀번호는 8자이상,20자 이하로 입력해주세요.")
    @Column(nullable = false,length = 100)
    private String password;

    @Email(message = "올바른 이메일을 입력해주세요.")
    @Column(nullable = false,length = 50,unique = true)
    private String email;

    @Enumerated(EnumType.STRING)
    private RoleType role; //Enum쓸것,오타방지

    @CreationTimestamp //시간자동입력
    private Timestamp createDate;



}
