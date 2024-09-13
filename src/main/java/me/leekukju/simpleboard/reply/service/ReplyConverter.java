package me.leekukju.simpleboard.reply.service;

import lombok.RequiredArgsConstructor;
import me.leekukju.simpleboard.crud.Converter;
import me.leekukju.simpleboard.post.db.PostRepository;
import me.leekukju.simpleboard.reply.db.ReplyEntity;
import me.leekukju.simpleboard.reply.model.ReplyDto;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class ReplyConverter implements Converter<ReplyDto, ReplyEntity> {

    private final PostRepository postRepository;

    @Override
    public ReplyDto toDTO(ReplyEntity replyEntity) {

        return ReplyDto.builder()
                .id(replyEntity.getId())
                .postId(replyEntity.getPost().getId())
                .status(replyEntity.getStatus())
                .title(replyEntity.getTitle())
                .content(replyEntity.getContent())
                .userName(replyEntity.getUserName())
                .password(replyEntity.getPassword())
                .repliedAt(replyEntity.getRepliedAt())
                .build();

    }

    @Override
    public ReplyEntity toEntity(ReplyDto replyDto) {

        var postEntity = postRepository.findById(replyDto.getPostId());

        return ReplyEntity.builder()
                .id(replyDto.getId())
                .post(postEntity.orElseGet(() -> null))
                .status((replyDto.getStatus() != null ? replyDto.getStatus() : "REGISTERED"))
                .title(replyDto.getTitle())
                .content(replyDto.getContent())
                .userName(replyDto.getUserName())
                .password(replyDto.getPassword())
                .repliedAt((replyDto.getRepliedAt() != null) ? replyDto.getRepliedAt() : LocalDateTime.now())
                .build();

    }
}
