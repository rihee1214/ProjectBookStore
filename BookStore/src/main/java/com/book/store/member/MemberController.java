package com.book.store.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/member/**")
public class MemberController {

	@Autowired
	private MemberService memberService;
	
	@GetMapping("login")
	public void getLogin()throws Exception{
		
	}
	
	@PostMapping("login")
	public void getLogin(MemberVO memberVO)throws Exception{
		memberVO = memberService.getLogin(memberVO);
	}
	
	@GetMapping("join")
	public void setJoin()throws Exception{
		
	}
	
	@PostMapping("join")
	public void setJoin(MemberVO memberVO)throws Exception{
		
	}
	
	@PostMapping("joinCheck")
	@ResponseBody
	public boolean joinCheck(MemberVO memberVO)throws Exception{
		memberVO = memberService.joinCheck(memberVO);
		return (memberVO==null);
	}
}
