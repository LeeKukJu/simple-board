package me.leekukju.simpleboard.board.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import me.leekukju.simpleboard.board.db.BoardEntity;
import me.leekukju.simpleboard.board.model.BoardDto;
import me.leekukju.simpleboard.board.model.BoardRequest;
import me.leekukju.simpleboard.board.service.BoardService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/board")
public class BoardApiController {

    private final BoardService boardService;

    @PostMapping("")
    public BoardDto create(
            @Valid
            @RequestBody
            BoardRequest boardRequest
    ) {
        return boardService.create(boardRequest);
    }

    @GetMapping("/id/{id}")
    public BoardDto view(
            @PathVariable Long id
    ) {
        return boardService.view(id);
    }
}
