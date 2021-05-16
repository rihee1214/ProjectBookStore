package com.book.store.member;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {

	//로그인 확인
	public MemberVO getLogin(MemberVO memberVO)throws Exception;
	//memberJoin
	public Long setJoin(MemberVO memberVO)throws Exception;
	//joinCheck
	public MemberVO joinCheck(MemberVO memberVO)throws Exception;
}
