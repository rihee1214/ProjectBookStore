package com.book.store.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

	@Autowired
	private MemberMapper memberMapper;
	
	public MemberVO getLogin(MemberVO memberVO)throws Exception{
		return memberMapper.getLogin(memberVO);
	}
	
	public Long setJoin(MemberVO memberVO)throws Exception{
		return memberMapper.setJoin(memberVO);
	}
	
	public MemberVO joinCheck(MemberVO memberVO)throws Exception{
		return memberMapper.joinCheck(memberVO);
	}
}
