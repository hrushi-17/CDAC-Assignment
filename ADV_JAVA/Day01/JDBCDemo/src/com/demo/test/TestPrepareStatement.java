package com.demo.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class TestPrepareStatement {

	public static void main(String[] args) {
		
		Connection conn = null;
		
		try {
			//Created Object 
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			String url = "jdbc:mysql://192.168.10.117:3306/dac16?useSSL=false";
			
			conn = DriverManager.getConnection(url,"dac16","welcome");
			
			PreparedStatement pst = conn.prepareStatement("select * from myproduct");
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				System.out.println("-----------------------------");
				System.out.println("pid:" +rs.getInt("pid"));
		    	System.out.println("pname:"+ rs.getString("pname"));
		    	System.out.println("qty"+rs.getInt("qty"));
		    	System.out.println("price:"+rs.getDouble("price"));
		    	System.out.println("mfgdate:"+rs.getDate("mfgdate"));
		    	System.out.println("-----------------------------");
			}
			PreparedStatement pst1 = conn.prepareStatement("insert into myproduct values(?,?,?,?,?)");
			int pid = 4;
			String pname = "Devyanshi";
			int qty = 10;
			double price = 34.11;
			LocalDate lt = LocalDate.now();
			String mfgdate = lt.toString();
			
			pst1.setInt(1, pid);
			pst1.setString(2, pname);
			pst1.setInt(3, qty);
			pst1.setDouble(4, price);
			pst1.setDate(5, java.sql.Date.valueOf(lt));
			
			int n = pst1.executeUpdate();
			System.out.println();
			if(n>0) {
				System.out.println("Inserted Data in MySQL xD ");
			}else {
				System.out.println("Cannot Insert the Data ;(");
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
