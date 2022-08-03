package com.bh.start.bankBook;

public class BankBookDTO {
	
	private Long BookNum;
	private String BookName;
	private double BookRate;
	private Integer BookSale;
	
	
	public Long getBookNum() {
		return BookNum;
	}
	public void setBookNum(Long bookNum) {
		BookNum = bookNum;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public double getBookRate() {
		return BookRate;
	}
	public void setBookRate(double bookRate) {
		BookRate = bookRate;
	}
	public Integer getBookSale() {
		return BookSale;
	}
	public void setBookSale(Integer bookSale) {
		BookSale = bookSale;
	}

}
