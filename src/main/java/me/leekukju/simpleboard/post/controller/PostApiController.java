package me.leekukju.simpleboard.post.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import me.leekukju.simpleboard.post.db.PostEntity;
import me.leekukju.simpleboard.post.model.PostRequest;
import me.leekukju.simpleboard.post.model.PostViewRequest;
import me.leekukju.simpleboard.post.service.PostService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/post")
public class PostApiController {

    private final PostService postService;

    @PostMapping("")
    public PostEntity create(
            @Valid
            @RequestBody PostRequest postRequest
    ) {
        return postService.create(postRequest);
    }

    @PostMapping("/view")
    public PostEntity view(
            @Valid
            @RequestBody PostViewRequest postViewRequest
    ) {
        return postService.view(postViewRequest);
    }

    @GetMapping("/all")
    public List<PostEntity> list() {
        return postService.all();
    }

    @PostMapping("/delete")
    public void delete(
            @Valid
            @RequestBody PostViewRequest postViewRequest
    ) {
        postService.delete(postViewRequest);
    }
}
