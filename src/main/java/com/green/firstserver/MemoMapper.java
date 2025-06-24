package com.green.firstserver;

import com.green.firstserver.model.MemoGetOneRes;
import com.green.firstserver.model.MemoGetRes;
import com.green.firstserver.model.MemoPostReq;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.List;
// 인터페이스가 implements한 클래스가 만들어지고 그 클래스를 객체화함 (주소값).
// 그 주소값을 스프링 컨테이너가 들고 있는다. (그러면 di를 할 수 있음. )
// 스프링 컨테이너가 객체 주소값을 들고 있을 수 있는 건 빈등록이 되었기 때문임.

@Mapper
public interface MemoMapper {
    // insert, update, delete는 메소드 생성시 리턴타입 int
    int insMemo(MemoPostReq req);
    List<MemoGetRes> selMemoList();

    MemoGetOneRes selMemo(int id);


}


