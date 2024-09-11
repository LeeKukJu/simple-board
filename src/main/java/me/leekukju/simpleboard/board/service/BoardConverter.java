package me.leekukju.simpleboard.board.service;

import lombok.RequiredArgsConstructor;
import me.leekukju.simpleboard.board.db.BoardEntity;
import me.leekukju.simpleboard.board.model.BoardDto;
import me.leekukju.simpleboard.post.service.PostConverter;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BoardConverter {

    private final PostConverter postConverter;

    public BoardDto toDto(BoardEntity boardEntity) {

        var postList = boardEntity.getPostList()
                .stream()
                .map(postConverter::toDto)
                .collect(Collectors.toList());

        return BoardDto.builder()
                .id(boardEntity.getId())
                .boardName(boardEntity.getBoardName())
                .status(boardEntity.getStatus())
                .postList(postList)
                .build();
    }
}
