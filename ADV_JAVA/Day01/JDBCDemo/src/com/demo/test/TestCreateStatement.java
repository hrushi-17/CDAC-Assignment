package com.demo.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class TestCreateStatement {

	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			//Step 1
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			//Step 2
			String url = "jdbc:mysql://192.168.10.117:3306/dac16?useSSL=false";
			
			conn=DriverManager.getConnection(url,"dac16","welcome");
			if(conn!=null) {
				System.out.println("Connection Done!!");
			}else {
				System.out.println("Connection not Done");
			}
			
			//Step 3
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from myproduct");
			while(rs.next()){
				System.out.println("Pid:"+rs.getInt(1));
				System.out.println("Pname:"+rs.getString(2));
				System.out.println("qty:"+rs.getInt(3));
				System.out.println("price:"+rs.getDouble(4));
				System.out.println("Mfgdate:"+rs.getDate(5));
				System.out.println("----------------------");
			}
			
			int pid = 1;
			String pname = "xxxx";
			int qty = 45;
			double price = 239.16;
			LocalDate ldt = LocalDate.now();
			String mfgdate = ldt.toString();
			String query = "insert into myproduct value("+pid+",'"+pname+"',"+qty+","+price+",'"+mfgdate+"')";
			System.out.println(query);
			int n = st.executeUpdate(query);
			
			if(n>0) {
				System.out.println("Insertion Done!!");
			}else {
				System.out.println("Error...");
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			
			e.printStackTrace();
			}finally {
				try {
					conn.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}

	}

}
