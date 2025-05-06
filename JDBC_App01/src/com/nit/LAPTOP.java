package com.nit;

import java.sql.*;


public class LAPTOP {                                               
	public static void main(String[] args) {
		try {
//			Loading the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
//			Creating Connection 
		Connection con=	DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:orcl","devendra","8718");
			
//		Preparing the Statement
		Statement st = con.createStatement();
//		
		ResultSet rs = st.executeQuery("select *from LAPTOP");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+
						"\t"+rs.getString(3)+"\t\t\t"+rs.getString(4)+
						"\t\t\t"+rs.getInt(5));		
			}	
		} 
		catch (Exception e) {
			System.out.println("hello");
			e.printStackTrace();
		}

	}

}
