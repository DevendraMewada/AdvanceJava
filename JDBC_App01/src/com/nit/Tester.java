package com.nit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Tester {
	public static void main(String[] args) {
		
		try {
//			Loading the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
//			Creating Connection 
		Connection con=	DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","devendra","8718");
			
//		Preparing the Statement
		Statement st = con.createStatement();
		
//		
			ResultSet rs = st.executeQuery("select *from person");
			
			while(rs.next())
			{
				System.out.println(rs.getString("PID")+"  : "+rs.getString(2)+"  :  "+rs.getString(3));
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
