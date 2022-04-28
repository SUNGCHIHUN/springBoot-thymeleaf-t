package com.springboot.ex02.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.ex02.vo.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO {

	@Autowired
	SqlSession sqlSession;
	
	@Override
	public List<MemberVO> getMemberList() {
		MemberDAO dao = sqlSession.getMapper(MemberDAO.class);
		return dao.getMemberList();
	}

}