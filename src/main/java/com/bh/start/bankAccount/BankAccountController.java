package com.bh.start.bankAccount;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bh.start.bankBook.BankBookDAO;

@Controller
 public class BankAccountController {
	
	private BankAccountDAO bankAccountDAO;
	
	public BankAccountController() {
		this.bankAccountDAO = new BankAccountDAO();
	}
	
	@RequestMapping(value="add.bh", method=RequestMethod.GET)
	public String add() {
		System.out.println("BankAccount Add");
		
		session.invalidate();
		return "redirect:../";
		
		
	}
}
