package com.bh.start.bankMember;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
//이 클래스틑 Controller 역할, Container에게 이 클래스의 객체 생성을 위임
public class MemberController {
	//servlet 아님 순수 java 클래스

	//annotation
	//@ : 설명+실행의 역할

	//value에는 꼭 절대경로
	//  /member/login 시 실행하는 메서드
	@RequestMapping(value = "/member/*")
	public String login() {
		System.out.println("로그인 실행");

		return "member/login";
	}

//==============================================	
	// join /member/join
	@RequestMapping(value = "/member/join", method=RequestMethod.GET)
	public String join() throws Exception {
		System.out.println("회원가입 GET 실행");

		return "member/join";
	}

	// join /member/join	
	@RequestMapping(value = "/member/join", method=RequestMethod.POST)

//=========== 버전 1 =========================================================	
	//내장 객체인 request로 parameter 받기

//	public String join(HttpServletRequest request) throws Exception {
//		System.out.println("회원가입 POST 실행");
//		
//		BankMembersDAO bankMembersDAO = new BankMembersDAO();
//		BankMembersDTO bankMembersDTO = new BankMembersDTO();
//		
//		String username = request.getParameter("username");
//		bankMembersDTO.setUsername("username");
//		bankMembersDTO.setPassword(request.getParameter("password"));
//		bankMembersDTO.setName(request.getParameter("email"));
//		bankMembersDTO.setPhone(request.getParameter("phone"));
//		int result = bankMembersDAO.setJoin(bankMembersDTO);
//		return "member/join";

//=========== 버전 2 =========================================================

	//↑parameter 쓴 수정 전 버전
	//request 선언 한하고 매개변수에 최종 변수명? 선언하면 Parameter 안써도 됨

//	public String join(String username, String password, String email, String phone) throws Exception {
//		System.out.println("회원가입 POST 실행");
//			
//		BankMembersDAO bankMembersDAO = new BankMembersDAO();
//		BankMembersDTO bankMembersDTO = new BankMembersDTO();
//			
//		//String username = request.getParameter("username");
//		bankMembersDTO.setUsername("username");
//		bankMembersDTO.setPassword("password");
//		bankMembersDTO.setName("email");
//		bankMembersDTO.setPhone("phone");
//		int result = bankMembersDAO.setJoin(bankMembersDTO);
//	
//		return "member/join";

//=========== 버전 3 =========================================================	

	//멤버변수 이름, 파라미터 이름 동일 / 세터 메서드 필요
	//DTO로 받기
	public String join(BankMembersDTO bankMembersDTO) throws Exception {
	System.out.println("회원가입 POST 실행");

	BankMembersDAO bankMembersDAO = new BankMembersDAO();
	int result = bankMembersDAO.setJoin(bankMembersDTO);
	System.out.println(result==1);

	//로그인폼 페이지로 이동
	//redirect
	return "member/join";	
	}

	@RequestMapping(value = "search", method =RequestMethod.GET)
	public void getSearchByID () throws Exception {
		//ModelAndView 리턴하는 방법
		//ModelAndView mv = new ModelAndView();
		//mv.setView("member/view");
		//return.mv;
	}

	@RequestMapping(value="search", method=RequestMethod.POST)
	public String getSearchByID(String search, Model model) throws Exception{
		BankMembersDAO bankMembersDAO = new BankMembersDAO();
		ArrayList<BankMembersDTO> ar = bankMembersDAO.getSearchByID(null);
		model.addAttribute("list", ar);
		return "member/list";
	}






}