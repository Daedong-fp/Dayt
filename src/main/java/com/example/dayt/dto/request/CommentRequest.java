package com.example.dayt.dto.request;

import com.example.dayt.entity.Requirement;
import lombok.Getter;

@Getter
public class CommentRequest {
    private Long id;
    private Requirement requirement;
    private String userName;
    private String content;
    private int createTime;
}
