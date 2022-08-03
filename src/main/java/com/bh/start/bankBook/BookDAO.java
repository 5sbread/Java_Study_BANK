package com.bh.start.bankBook;

import java.util.ArrayList;

import com.bh.start.bank.BankMembersDTO;

public interface BookDAO {
	
	
	//BankBook Table에 insert
	//BookNum : 현재 시간을 밀리세컨즈로 변환해서 입력
	//BookSale : 1로 입력
	public int setBankBook (BankBookDTO bankBookDTO) throws Exception;

	//BankBook 모든 데이터를 조회 - 최신순으로
	public ArrayList<BankBookDTO> getList() throws Exception;
	
	//Sale 컬럼 수정
	public int setChangeSale (BankBookDTO bankBookDTO) throws Exception;
	
	//BookNum의 값으로 조회
	public BankBookDTO getDetail (BankBookDTO bankBookDTO) throws Exception;
}
