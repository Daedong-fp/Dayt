package com.example.dayt.entity;

import com.example.dayt.dto.request.TaskRequest;
import com.example.dayt.entity.role.Role;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "Task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String color;

    private String userName;

    @Column(length = 20)
    private String title;

    @Column(length = 30)
    private String takeList;


    @Column(length = 10)
    private String status;

    @CreatedDate
    private int createTime;

    @LastModifiedDate
    private int moveTime;


    @Builder
    public Task(Long id,String userName, String title, String takeList, String status, int createTime) {
        this.id = id;
        this.userName = userName;
        this.title = title;
        this.takeList = takeList;
        this.status = status;
        this.createTime = createTime;
    }

    public void update(TaskRequest taskRequest) {
        this.title = taskRequest.getTitle();
        this.takeList = taskRequest.getTakeList();
        this.status = taskRequest.getStatus();
    }

//    public void move(Board targetBoard) {
//        this.board = targetBoard;
//    }

}

