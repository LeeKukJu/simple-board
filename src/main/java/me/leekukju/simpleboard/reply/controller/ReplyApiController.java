package me.leekukju.simpleboard.reply.controller;

import lombok.RequiredArgsConstructor;
import me.leekukju.simpleboard.crud.CRUDAbstractApiController;
import me.leekukju.simpleboard.reply.db.ReplyEntity;
import me.leekukju.simpleboard.reply.model.ReplyDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/reply")
@RequiredArgsConstructor
public class ReplyApiController extends CRUDAbstractApiController<ReplyDto, ReplyEntity> {

//    private final ReplyService replyService;
//
//    @PostMapping("")
//    public ReplyEntity create(
//            @Valid
//            @RequestBody ReplyRequest replyRequest
//    ) {
//        return replyService.create(replyRequest);
//    }



}
