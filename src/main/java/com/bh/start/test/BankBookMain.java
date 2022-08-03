package com.bh.start.test;

import com.bh.start.bankBook.BankBookDAO;
import com.bh.start.bankBook.BankBookDTO;

public class BankBookMain {

	public static void main(String[] args) {
		
		BankBookDAO bankBookDAO = new BankBookDAO();
		BankBookDTO bankBookDTO = new BankBookDTO();
		
		bankBookDTO.setBookNum(9256L);
		
		try {
			bankBookDTO = bankBookDAO.getDetail(bankBookDTO);
			System.out.println(bankBookDTO != null);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
