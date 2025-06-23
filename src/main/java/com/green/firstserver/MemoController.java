package com.green.firstserver;

import com.green.firstserver.model.MemoPostReq;
import org.springframework.web.bind.annotation.*;

@RestController //빈(Bean) 등록, 스프링 컨테이너 객체 생성을 대리로 맡긴다. 요청/응답 담당
public class MemoController {

    @GetMapping("memo")
    public String getMemo(){
        return "Hello Board!";
    }

    @GetMapping("/memo/{board_id}")
    public String getMemo(@PathVariable("board_id") int board_id){
        System.out.println("boardId: " + board_id);
        return "Hello Board! - boardId: " + board_id;
    }

    @PostMapping("/memo")
    public String postMemo(@RequestBody MemoPostReq req){ //@RequestBody는 json 데이터를 받을거야라는 뜻.
        System.out.println("postMemo: " + req);
        return "post Board!";
    }
}
