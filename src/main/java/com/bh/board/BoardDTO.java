package com.bh.board;

import java.sql.Date;

public class BoardDTO {
	
	private Long boardIndex;
	private String boardTitle;
	private String boardMain;
	private String boardName;
	private Date boardDate;
	private Long boardView;
	
	
	
	
	public Long getBoardNum() {
		return boardIndex;
	}
	public void setBoardNum(Long boardIndex) {
		this.boardIndex = boardIndex;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public String getBoardMain() {
		return boardMain;
	}
	public void setBoardMain(String boardMain) {
		this.boardMain = boardMain;
	}
	public String getBoardName() {
		return boardName;
	}
	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}
	public Date getBoardDate() {
		return boardDate;
	}
	public void setBoardDate(Date boardDate) {
		this.boardDate = boardDate;
	}
	public Long getBoardView() {
		return boardView;
	}
	public void setBoardView(Long boardView) {
		this.boardView = boardView;
	}

	
}
