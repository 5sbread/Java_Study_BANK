package com.bh.start.bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.spi.DirStateFactory.Result;

import com.bh.start.util.DBConnector;

public class BankMembersDAO {

	public ArrayList<BankMembersDTO> getlist () throws Exception{
		
		ArrayList<BankMembersDTO> ar = new ArrayList<BankMembersDTO>();
		Connection con = DBConnector.getConnection();
		String sql = "SELECT * FROM BACKMEMBERS WHERE USERNAME LIKE ? ORDER BY USERNAME ASC";
		PreparedStatement st =con.prepareStatement(sql);
		st.setString(1, "%"+search+"%");
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			BankMembersDTO bankMembersDTO = new BankMembersDTO();
			bankMembersDTO.setUsername(rs.getString("USERNAME"));
			bankMembersDTO.setPassword(rs.getString("PASSWORD"));
			bankMembersDTO.setName(rs.getString("NAME"));
			bankMembersDTO.setEmail(rs.getString("EMAIL"));
			bankMembersDTO.setPhone(rs.getString("PHONE"));
			ar.add(bankMembersDTO);
		}
		
		DBConnector.getConnection();
		
		return ar;
		
		
				
		
	}
	
//====================================
//회원가입
	public int setJoin(BankMembersDAO bankMembersDAO) throws Exception{
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
//====================================
//검색어를 입력ㅎ서 ID를 찾기 abc 순으로
	public ArrayList<BankMembersDTO> getSearchByID(String search) throws Exception{

		ArrayList<BankMembersDTO> ar = new ArrayList();
		Connection con = DBConnector.getConnection();
		String sql = "SELECT & FROM BACKMEMBERS";
		PreparedStatement st =con.prepareStatement(sql);
		DBConnector.getConnection();
		
		
		
		
		
	}
	
	
	
	
	
	
}
