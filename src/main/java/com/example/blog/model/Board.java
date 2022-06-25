package com.example.blog.model;

import ch.qos.logback.core.joran.action.AppenderRefAction;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 100)
    private String title;

    @Lob
    private String content;

    @ColumnDefault("0")
    private int count;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "userId") // name = fk 명
    private User user;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "restaurant")
    private List<Reply> reply;

    @CreationTimestamp
    private Timestamp createDate;
}
