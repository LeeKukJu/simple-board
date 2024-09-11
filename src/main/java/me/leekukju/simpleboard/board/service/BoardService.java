package me.leekukju.simpleboard.board.service;

import lombok.RequiredArgsConstructor;
import me.leekukju.simpleboard.board.db.BoardEntity;
import me.leekukju.simpleboard.board.db.BoardRepository;
import me.leekukju.simpleboard.board.model.BoardDto;
import me.leekukju.simpleboard.board.model.BoardRequest;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardConverter boardConverter;

    private final BoardRepository boardRepository;

    public BoardDto create(
            BoardRequest boardRequest
    ) {
        var entity = BoardEntity.builder()
                .boardName(boardRequest.getBoardName())
                .status("REGISTERED")
                .build();

        var saveEntity = boardRepository.save(entity);

        return boardConverter.toDto(saveEntity);
    }

    public BoardDto view(Long id) {
        var entity = boardRepository.findById(id).get();
        return boardConverter.toDto(entity);
    }
}
