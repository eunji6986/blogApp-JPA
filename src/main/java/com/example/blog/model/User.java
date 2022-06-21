package com.example.blog.model;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;
import java.sql.Timestamp;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
//@DynamicInsert insert시에 null필드 제외 default값 들어갈 수 있도록
@ToString
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //프로젝트와 연결된 DB의 넘버링 방법을 따라가기로 한다
    private int id;

    @Column(nullable = false,length = 30)
    private String username;

    @Column(nullable = false,length = 100)
    private String password;

    @Column(nullable = false,length = 50)
    private String email;

    @Enumerated(EnumType.STRING)
    private RoleType role; //Enum쓸것,오타방지

    @CreationTimestamp //시간자동입력
    private Timestamp createDate;

}
