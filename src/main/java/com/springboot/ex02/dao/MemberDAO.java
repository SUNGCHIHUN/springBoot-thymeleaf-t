package com.springboot.ex02.dao;

import java.util.List;

import com.springboot.ex02.vo.MemberVO;

public interface MemberDAO {
	
	public List<MemberVO> getMemberList();

}