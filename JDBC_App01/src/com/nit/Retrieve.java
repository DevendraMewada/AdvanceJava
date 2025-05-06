package com.nit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Retrieve {

	public static void main(String[] args) {
		try
		{
//			1. loading the Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
//			2. Creating the Connection 
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","devendra","8718");
		
//			3. Preparing the Statement
			Statement st = con.createStatement();
			PreparedStatement ps = con.prepareStatement("select *from emp");
			
			ResultSet psrs = ps.executeQuery();
			ResultSet srs = st.executeQuery("select *from emp");
			System.out.println("===========Prepared Statement==========");
			while(psrs.next())
			{
				System.out.println(psrs.getString(1));
			}
			
			System.out.println("===========Create Statement==========");
			while(srs.next())
			{
				System.out.println(srs.getString(1));
			}
		
		}
		catch(Exception e)
		{
			
		}
	}
}
