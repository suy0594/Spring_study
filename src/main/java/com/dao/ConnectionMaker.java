package com.dao;

import java.sql.Connection;
import java.sql.SQLException;

public interface ConnectionMaker {
	public Connection connectionMaker() throws ClassNotFoundException, SQLException ;
}
