package me.leekukju.simpleboard.board.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import me.leekukju.simpleboard.board.db.BoardEntity;
import me.leekukju.simpleboard.board.model.BoardRequest;
import me.leekukju.simpleboard.board.service.BoardService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/board")
public class BoardApiController {

    private final BoardService boardService;

    @PostMapping("")
    public BoardEntity create(
            @Valid
            @RequestBody
            BoardRequest boardRequest
    ) {
        return boardService.create(boardRequest);
    }
}
