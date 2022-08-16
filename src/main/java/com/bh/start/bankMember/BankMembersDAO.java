package com.bh.start.bankMember;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.spi.DirStateFactory.Result;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bh.start.util.DBConnector;

@Repository("myDAO")
		// ㄴ bean의 이름을 myDAO로 설정 (BankMembersDAO 아니고 myDAO가 됨)
public class BankMembersDAO implements MembersDAO{
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE = "com.bh.start.bankMembers.BankMembersDTO.";
	
	//로그인
	public BankMembersDTO getLogin (BankMembersDTO bankMembersDTO) throws Exception{
		
		return sqlSession.selectOne(NAMESPACE+"getLogin", bankMembersDTO);
		
		//Connection con = DBConnector.getConnection();
		//ㄴ database-context.xml에서 연결
		
//		String sql = "SELECT USERNAME, NAME FROM BANKMEMBERS WHERE USERNAME=? and PASSWORD=?";
		//ㄴ Mapper 파일로
		
//		PreparedStatement st = con.prepareStatement(sql);
//		st.setString(1, bankMembersDTO.getUsername());
//		st.setString(2, bankMembersDTO.getPassword());				
//		ResultSet rs = st.executeQuery();
		
//		if(rs.next()) {
//			bankMembersDTO = new BankMembersDTO();
//			bankMembersDTO.setUsername(rs.getString("USERNAME"));
//			bankMembersDTO.setName(rs.getString("PASSWORD"));
//		}else {
//			bankMembersDTO = null;
//		}
		//ㄴ myBatis에서 함
//		return bankMembersDTO;
		
	}
	

	//회원가입
	public int setJoin(BankMembersDTO bankMembersDTO) throws Exception{
		
		Connection con = DBConnector.getConnection();
		
		String sql = "INSERT INTO BANKMEMBERS VALUES(?,?,?,?,?)";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, bankMembersDTO.getUserName());
		st.setString(2, bankMembersDTO.getPassword());
		st.setString(3, bankMembersDTO.getName());
		st.setString(4, bankMembersDTO.getEmail());
		st.setString(5, bankMembersDTO.getPhone());
		
		int result = st.executeUpdate();
		return result;
	}	
//===================		
		
	public ArrayList<BankMembersDTO> getSearchByID(String search) throws Exception {
		
		ArrayList<BankMembersDTO> ar = new ArrayList<BankMembersDTO>();
		
		Connection con = DBConnector.getConnection();
		
		String sql = "SELECT * FROM BACKMEMBERS WHERE USERNAME LIKE ? ORDER BY USERNAME ASC";
		
		PreparedStatement st =con.prepareStatement(sql);
		
		st.setString(1, "%"+search+"%");
		
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			BankMembersDTO bankMembersDTO = new BankMembersDTO();
			bankMembersDTO.setUserName(rs.getString("USERNAME"));
			bankMembersDTO.setPassword(rs.getString("PASSWORD"));
			bankMembersDTO.setName(rs.getString("NAME"));
			bankMembersDTO.setEmail(rs.getString("EMAIL"));
			bankMembersDTO.setPhone(rs.getString("PHONE"));
			ar.add(bankMembersDTO);
		} //while
		
		return ar;
	}

	@Override
	public int setJoin(BankMembersDAO bankMembersDAO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
}	