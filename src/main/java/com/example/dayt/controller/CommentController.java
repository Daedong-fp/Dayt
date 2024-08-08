package com.example.dayt.controller;

import com.example.dayt.dto.request.CommentRequest;
import com.example.dayt.dto.response.CommentResponse;
import com.example.dayt.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Comment")
@RequiredArgsConstructor
public class CommentController {
    private final CommentService commentService;

    @Autowired
    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @PostMapping
    public void createComment(@RequestBody CommentRequest request) {
        commentService.createComment(request);
    }

    @GetMapping
    public List<CommentResponse> getComment() {
        return commentService.getAllComment();
    }

    @PatchMapping("/{id}")
    public void updateComment(@PathVariable Long id, @RequestBody CommentRequest commentRequest) {
        commentService.updateComment(id, commentRequest);
    }

    @DeleteMapping("/{id}")
    public void deleteComment(@PathVariable Long id) {
        commentService.deleteComment(id);
    }


}
