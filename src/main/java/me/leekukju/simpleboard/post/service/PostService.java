package me.leekukju.simpleboard.post.service;

import lombok.RequiredArgsConstructor;
import me.leekukju.simpleboard.post.db.PostEntity;
import me.leekukju.simpleboard.post.db.PostRepository;
import me.leekukju.simpleboard.post.model.PostRequest;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    public PostEntity create(
            PostRequest postRequest
    ) {
        var entity = PostEntity.builder()
                .boardId(1L) // 임시고정
                .userName(postRequest.getUserName())
                .password(postRequest.getPassword())
                .email(postRequest.getEmail())
                .status("REGISTERED")
                .title(postRequest.getTitle())
                .content(postRequest.getContent())
                .postedAt(LocalDateTime.now())
                .build();

        return postRepository.save(entity);
    }
}
