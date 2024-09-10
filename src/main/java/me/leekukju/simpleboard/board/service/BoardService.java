package me.leekukju.simpleboard.board.service;

import lombok.RequiredArgsConstructor;
import me.leekukju.simpleboard.board.db.BoardEntity;
import me.leekukju.simpleboard.board.db.BoardRepository;
import me.leekukju.simpleboard.board.model.BoardRequest;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    public BoardEntity create(
            BoardRequest boardRequest
    ) {
        var entity = BoardEntity.builder()
                .boardName(boardRequest.getBoardName())
                .status("REGISTERED")
                .build();

        return boardRepository.save(entity);
    }
}
