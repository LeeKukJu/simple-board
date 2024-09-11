package me.leekukju.simpleboard.post.db;

import jakarta.persistence.*;
import lombok.*;
import me.leekukju.simpleboard.reply.db.ReplyEntity;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity(name = "post")
public class PostEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long boardId;

    private String userName;

    private String password;

    private String email;

    private String status;

    private String title;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime postedAt;

    @Transient
    private List<ReplyEntity> replyList = List.of();
}
