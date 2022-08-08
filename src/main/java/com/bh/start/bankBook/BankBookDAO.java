package com.bh.start.bankBook;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.bh.start.util.DBConnector;

public class BankBookDAO implements BookDAO {

	@Override
	public int setBankBook(BankBookDTO bankBookDTO) throws Exception {
		
		BankBookDTO bankBookDTO1 = new BankBookDTO();
		Connection con = DBConnector.getConnection();
		String sql = "";
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setLong(1, bankBookDTO1.getBookNum());
		st.setInt(4, bankBookDTO1.getBookSale());
		
		int result = st.executeUpdate();
		DBConnector.disConnect(st, con);
		return result;
	}

	@Override
	public ArrayList<BankBookDTO> getList() throws Exception {
		
		ArrayList<BankBookDTO> ar = new ArrayList<BankBookDTO>();
		Connection con = DBConnector.getConnection();
		String sql = "SELECT * FROM BANKBOOK ORDER BY BOOKNUM ASC";
		PreparedStatement st = con.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			BankBookDTO bankBookDTO = new BankBookDTO();
			bankBookDTO.setBookNum(rs.getLong("BOOKNUM"));
			bankBookDTO.setBookName(rs.getString("BOOKNAME"));
			bankBookDTO.setBookRate(rs.getDouble("BOOKRATE"));
			bankBookDTO.setBookSale(rs.getInt("BOOKSALE"));
			ar.add(bankBookDTO);
		}
		DBConnector.disConnect(rs, st, con);
		return ar;
	}
	
//----------------------------------
	@Override
	public int setChangeSale(BankBookDTO bankBookDTO) throws Exception {
		
		BankBookDTO bankbookDTO = new BankBookDTO();
		
		Connection con = DBConnector.getConnection();
		String sql = "kk";
		PreparedStatement st = con.prepareStatement(sql);
		
		int result = st.executeUpdate();
		DBConnector.disConnect(st, con);
		return result;
	}

//----------------------------------
	@Override
	public BankBookDTO getDetail(BankBookDTO bankBookDTO) throws Exception {
		
		BankBookDTO bankBookDTO2 = null;
		
		Connection con = DBConnector.getConnection();
		String sql = "SELECT * FROM BANKBOOK WHERE BOOKNUM = ?";
		PreparedStatement st = con.prepareStatement(sql);
		st.setLong(1, bankBookDTO.getBookNum());
		ResultSet rs = st.executeQuery(); //조회가 될 수도 있고 안될 수도 있음 - null이면 조회 실패
		
		if(rs.next()) {
			//한 줄을 읽었을 때 데이터가 있으면 DTO 리턴
			//없으면 null 리턴
			bankBookDTO2 = new BankBookDTO();
			
			bankBookDTO.setBookNum(rs.getLong("BOOKNUM"));
			bankBookDTO.setBookName(rs.getString("BOOKNAME"));
			bankBookDTO.setBookRate(rs.getDouble("BOOKRATE"));
			bankBookDTO.setBookSale(rs.getInt("BOOKSALE"));
		}

		DBConnector.disConnect(rs, st, con);
		return bankBookDTO2;
	}

	
	
	
	
	
}
