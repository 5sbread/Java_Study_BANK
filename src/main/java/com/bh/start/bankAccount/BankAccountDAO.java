package com.bh.start.bankAccount;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.bh.start.util.DBConnector;

public class BankAccountDAO {
	
	public int add(BankAccountDTO bankAccountDTO) throws Exception {
		//1. DB 연결
		Connection con = DBConnector.getConnection();
		
		//2. SQL문 작성
		String sql = "INSERT INTO BANKACCOUNT"
				+ "VALUES (ACCOUNT_SEQ.NEXTVAL, ?, ?, sysdate)";
		
		//3. 미리 보내기
		PreparedStatement st = con.prepareStatement(sql);
		
		//4. ? 세팅
		st.setString(1, bankAccountDTO.getUserName());
		st.setLong(2, bankAccountDTO.getBookNum());
		
		//5. 최종 전송 후 결과 처리
		int result = st.executeUpdate();
		
		//6. 연결 해제
		DBConnector.disConnect(st, con);
		return result;
		
	}

}
