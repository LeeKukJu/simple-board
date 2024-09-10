package me.leekukju.simpleboard.post.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import me.leekukju.simpleboard.post.db.PostEntity;
import me.leekukju.simpleboard.post.model.PostRequest;
import me.leekukju.simpleboard.post.service.PostService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/post")
public class PostApiController {

    private final PostService postService;

    @PostMapping("")
    public PostEntity create(
            @Valid
            @RequestBody
            PostRequest postRequest
    ) {
        return postService.create(postRequest);
    }
}
