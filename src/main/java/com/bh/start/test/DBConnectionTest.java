package com.bh.start.test;

import java.sql.Connection;

import com.bh.start.util.DBConnector;

public class DBConnectionTest {

	public static void main(String[] args) {

		try {
			DBConnector.getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//try

	}

}
