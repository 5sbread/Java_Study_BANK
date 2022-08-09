package com.bh.start.bankBook;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping//(value="/bank/*")
public class Add {
	
	@RequestMapping(value="add", method=RequestMethod.POST)
	public String detail() {
		System.out.println("상품 추가 실행");
		
		return "/bankbook/add";
	}
	

}
