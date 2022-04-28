package com.springboot.ex02.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.ex02.dao.MemberDAOImpl;
import com.springboot.ex02.vo.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberDAOImpl memberDAO;
	
	@Override
	public List<MemberVO> list() {
		return memberDAO.getMemberList();
	}
}