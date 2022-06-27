package com.example.blog.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false,length = 100,unique = true)
    private String shopName;

    @Lob
    @Column(nullable = false)
    private String menu;

    @Column(length = 100)
    private String address;

    @Lob
    @Column
    private String ownerPR;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "restaurant")
    private List<Reply> reply;

    @ManyToOne
    @JoinColumn(name = "userId")
    private Users user;



}
