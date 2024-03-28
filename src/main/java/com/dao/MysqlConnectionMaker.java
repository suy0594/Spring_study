package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlConnectionMaker implements ConnectionMaker{

	@Override
	public Connection connectionMaker() throws ClassNotFoundException, SQLException {
		Connection c;
		Class.forName("com.mysql.jdbc.Driver");
		c = DriverManager.getConnection("jdbc:mysql://localhost/test_spring", "root", "root");
		return c;
	}
	
}
