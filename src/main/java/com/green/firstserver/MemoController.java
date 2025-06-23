package com.green.firstserver;

import com.green.firstserver.model.MemoGetRes;
import com.green.firstserver.model.MemoPostReq;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //빈(Bean) 등록, 스프링 컨테이너 객체 생성을 대리로 맡긴다. 요청/응답 담당
@RequiredArgsConstructor
public class MemoController {

    private final MemoService memoService; //서비스 주입

    //DI 받는 방법 3가지
    //1. 필드 주입
    //2. setter 주입 (메소드 주입)

    //3. 생성자 주입
    // public MemoController(MemoMapper memoMapper) {
    //    this.memoMapper = memoMapper;
    // }

    @PostMapping("/memo")
    public String postMemo(@RequestBody MemoPostReq req){ //@RequestBody는 json 데이터를 받을거야라는 뜻.
        System.out.println("postMemo: " + req);
        int result = memoService.insMemo(req);
        return result == 1? "성공" : "실패";
    }


    @GetMapping("/memo")
    public List<MemoGetRes> getMemo(){
        return memoService.selMemoList();
    }



}
