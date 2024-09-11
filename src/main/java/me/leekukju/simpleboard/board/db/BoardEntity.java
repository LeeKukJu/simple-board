package me.leekukju.simpleboard.board.db;

import jakarta.persistence.*;
import lombok.*;
import me.leekukju.simpleboard.post.db.PostEntity;
import org.hibernate.annotations.OrderBy;
import org.hibernate.annotations.Where;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity(name = "board")
public class BoardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String boardName;

    private String status;

    @OneToMany(mappedBy = "board")
    @Where(clause = "status = 'REGISTERED'")
    @OrderBy(clause = "id DESC")
    private List<PostEntity> postList = List.of();
}
