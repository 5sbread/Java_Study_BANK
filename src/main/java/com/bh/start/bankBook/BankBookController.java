package com.bh.start.bankBook;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/bankbook/*")
public class BankBookController {

	
	
	@RequestMapping(value="update", method=RequestMethod.GET)
	public void update()throws Exception{
		
		
		
		
		
	}
	
	
	
	// /bankbook/add POST
	// name, rate
	@RequestMapping(value="add", method=RequestMethod.POST)
	public ModelAndView add(BankBookDTO bankBookDTO) throws Exception{
		ModelAndView mv = new ModelAndView();
		System.out.println(bankBookDTO.getBookName());
		System.out.println(bankBookDTO.getBookRate());
		BankBookDAO bankBookDAO = new BankBookDAO();
		//등록 후 list 페이지로 이동
		mv.setViewName("redirect:./list");
		return mv;
	}


	// /bankbook/add Get  /WEB-INF/views/bankbook/add.jsp
	@RequestMapping("add")
	public String add() throws Exception{
		System.out.println("add 실행");
		return "bankbook/add";
	}


	//요청 url과 return 주소값이 같을 때
	// => return 없이 void 가능
	@RequestMapping(value="list", method=RequestMethod.GET)
	public String list(Model model) throws Exception {
		System.out.println("리스트 실행");
		BankBookDAO bankBookDAO = new BankBookDAO();
		ArrayList<BankBookDTO> ar = bankBookDAO.getList();
		model.addAttribute("list",ar);
		//return "bankbook/list";
		return "bankbook/list";
	}

	@RequestMapping(value="detail", method=RequestMethod.GET)
	public ModelAndView detail(BankBookDTO bankBookDTO) throws Exception {
		ModelAndView mv = new ModelAndView();
		System.out.println("디테일 실행");

		BankBookDAO bankBookDAO = new BankBookDAO();
		bankBookDTO = bankBookDAO.getDetail(bankBookDTO);

		mv.setViewName("bankbook/detail");
		mv.addObject("DTO", bankBookDAO);

		//System.out.println("BookNum : "+booknum);
		//return "bankbook/detail";
		return mv;
	}


}