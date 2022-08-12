package com.bh.start.bankAccount;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bh.start.bankBook.BankBookDAO;
import com.bh.start.bankMember.BankMembersDTO;

@Controller
 public class BankAccountController {
	
	private BankAccountDAO bankAccountDAO;
	
	public BankAccountController() {
		this.bankAccountDAO = new BankAccountDAO();
	}
	
	@RequestMapping(value="add.bh", method=RequestMethod.GET)
	public String add(BankAccountDTO bankAccountDTO, HttpSession session) throws Exception {
		System.out.println("BankAccount Add");
		System.out.println(bankAccountDTO.getAccountNum());
		
		BankMembersDTO bankMembersDTO = (BankMembersDTO)session.getAttribute("member");
		bankAccountDTO.setUserName(bankMembersDTO.getUsername());
		
		int result = this.bankAccountDAO.add(bankAccountDTO);
		return "redirect:../bankbook/list.bh";
	}
}
