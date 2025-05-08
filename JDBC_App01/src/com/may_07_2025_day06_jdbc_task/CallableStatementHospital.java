package com.may_07_2025_day06_jdbc_task;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class CallableStatementHospital {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","devendra","8718");
			CallableStatement cs= con.prepareCall("{call insertPatientData(?,?,?,?,?,?,?,?,?)}");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter patient Id : ");
			int Id=Integer.parseInt(sc.nextLine());
			System.out.println(" Enter patient name : ");
			String name=sc.nextLine();
			System.out.println(" Enter patient Age : ");
			int Age=Integer.parseInt(sc.nextLine());
			System.out.println(" Enter patient Disease : ");
			String disease=sc.nextLine();
			System.out.println(" Enter patient house number : ");
			int houseNo=Integer.parseInt(sc.nextLine());
			System.out.println(" Enter patient City : ");
			String city=sc.nextLine();
			System.out.println(" Enter patient pincode : ");
			int pincode=Integer.parseInt(sc.nextLine());
			System.out.println(" Enter patient email id : ");
			String emailId=sc.nextLine();
			
			System.out.println(" Enter patient phone number : ");
			long phoneNo=Integer.parseInt(sc.nextLine());
            cs.setInt(1,Id);
            cs.setString(2,name);
            cs.setInt(3, Age);
            cs.setString(4,disease);
            cs.setInt(5,houseNo);
            cs.setString(6,city);
            cs.setInt(7, pincode);
            cs.setString(8, emailId);
            cs.setLong(9, phoneNo);
			
			cs.execute();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
