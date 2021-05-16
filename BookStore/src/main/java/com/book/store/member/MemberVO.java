package com.book.store.member;

import lombok.Data;

@Data
public class MemberVO {

	private String id;
	private String pw;
	private String name;
	private String email;
	private String phone;
	private String grade;
	private Long point;
}
