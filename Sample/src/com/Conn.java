package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conn {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/db?characterEncoding=utf-8&useUnicode=true&serverTimezone=CTT","root","YOGA6906");
		PreparedStatement ps=c.prepareStatement("select NAME from USER WHERE ID=2");
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			System.out.println(rs.getString(1));
		}
		ps.close();
		c.close();
	}

}
