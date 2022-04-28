package com.springboot.ex02.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.ex02.service.MemberService;
import com.springboot.ex02.vo.MemberVO;

@Controller
public class MemberController {
	
	@Autowired
	MemberService service;
	
	// 회원목록
	@RequestMapping("memberList")
	public ModelAndView memberList(ModelAndView mav) {
		
		List<MemberVO> memberList = service.list();
		mav.setViewName("include/memberList"); // View의 이름 : src/main/resources/templates/memberList.html
		mav.addObject("list", memberList); // memberList.html에서 EL 태그로 받는다. ${list}
		
		return mav;
	}	
}