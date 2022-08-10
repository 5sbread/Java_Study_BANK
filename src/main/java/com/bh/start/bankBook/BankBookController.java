package com.bh.start.bankBook;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/bank/*")
public class BankBookController {
	
	@RequestMapping(value="list", method=RequestMethod.GET)
	public String list() {
		System.out.println("리스트 실행");
		
		return "/bankbook/list";
	}

	@RequestMapping(value="detail", method=RequestMethod.GET)
	public String detail() {
		System.out.println("디테일 실행");
		
		return "/bankbook/detail";
	}
	
	
}
