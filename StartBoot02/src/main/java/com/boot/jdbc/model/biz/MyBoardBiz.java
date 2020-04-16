package com.boot.jdbc.model.biz;

import java.util.List;

import com.boot.jdbc.model.dto.MyBoardDto;

public interface MyBoardBiz {

	public List<MyBoardDto> selectList();

	public MyBoardDto seletOne(int myno);

	public int insert(MyBoardDto dto);

	public int update(MyBoardDto dto);

	public int delete(int myno);
}
