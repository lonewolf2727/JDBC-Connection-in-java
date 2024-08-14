package com.JDBCOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlSelectCommand {

	public static void main(String[] args) throws SQLException{
		Connection con =DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/dbase","root","Nte#25");
		Statement stamt = con.createStatement();
		String s ="SELECT * from dbase.book_detl;";
		
		ResultSet rs = stamt.executeQuery(s);
		while(rs.next()) {
			String bid = rs.getString("book_no");
		    String tit = rs.getString("title");
		    String sc = rs.getString("sub_code");
		    String aut = rs.getString("author");
		    String pub = rs.getString("publisher");
		    String sts = rs.getString("status");
		    String yop = rs.getString("yop");
		    String prc = rs.getString("price");
		    
		    System.out.println("Bno: " + bid + ", tit: " + tit + ", scode: " + sc + ", aut: " + aut + ", pub: " + pub + ", sts: " + sts + ", yop: " + yop + ", prc: " + prc);
		    
		}
		con.close();
		System.out.println("Statement Executed : Query executed......");
	}

}
