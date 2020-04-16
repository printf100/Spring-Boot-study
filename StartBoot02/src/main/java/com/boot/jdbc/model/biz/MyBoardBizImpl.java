package com.boot.jdbc.model.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.jdbc.model.dto.MyBoardDto;
import com.boot.jdbc.model.mapper.MyBoardMapper;

@Service
public class MyBoardBizImpl implements MyBoardBiz {

	@Autowired
	private MyBoardMapper mapper;

	@Override
	public List<MyBoardDto> selectList() {
		return mapper.selectList();
	}

	@Override
	public MyBoardDto seletOne(int myno) {
		return mapper.selectOne(myno);
	}

	@Override
	public int insert(MyBoardDto dto) {
		return mapper.insert(dto);
	}

	@Override
	public int update(MyBoardDto dto) {
		return mapper.update(dto);
	}

	@Override
	public int delete(int myno) {
		return mapper.delete(myno);
	}

}
