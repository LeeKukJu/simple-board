package me.leekukju.simpleboard.reply.service;

import lombok.RequiredArgsConstructor;
import me.leekukju.simpleboard.crud.CRUDAbstractService;
import me.leekukju.simpleboard.post.db.PostRepository;
import me.leekukju.simpleboard.reply.db.ReplyEntity;
import me.leekukju.simpleboard.reply.db.ReplyRepository;
import me.leekukju.simpleboard.reply.model.ReplyDto;
import me.leekukju.simpleboard.reply.model.ReplyRequest;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ReplyService extends CRUDAbstractService<ReplyDto, ReplyEntity> {

    /*private final ReplyRepository replyRepository;

    private final PostRepository postRepository;

    public ReplyEntity create(
            ReplyRequest replyRequest
    ) {
        var optionalPostEntity = postRepository.findById(replyRequest.getPostId());

        if(optionalPostEntity.isEmpty()) {
            throw new RuntimeException("게시물이 존재하지 않습니다 : " + replyRequest.getPostId());
        }

        var entity = ReplyEntity.builder()
                .post(optionalPostEntity.get())
                .userName(replyRequest.getUserName())
                .password(replyRequest.getPassword())
                .status("REGISTERED")
                .title(replyRequest.getTitle())
                .content(replyRequest.getContent())
                .repliedAt(LocalDateTime.now())
                .build();

        return replyRepository.save(entity);
    }

    public List<ReplyEntity> findAllByPostId(Long postId) {
        return replyRepository.findAllByPostIdAndStatusOrderByIdDesc(postId, "REGISTERED");
    }*/
}
