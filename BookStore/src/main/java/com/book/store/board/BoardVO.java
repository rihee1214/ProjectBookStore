package com.book.store.board;

import lombok.Data;

@Data
public class BoardVO {

	private Long subnum;
	private String subname;
	private String id;
	private String regdate;
	private String content;
	private Long vcount;
}
