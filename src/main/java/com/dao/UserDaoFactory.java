package com.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserDaoFactory {
	
	@Bean
	public UserDao userDao() {
		ConnectionMaker connectionMaker = new MysqlConnectionMaker();
		UserDao dao = new UserDao(connectionMaker);
		return dao;
	}
	
	public ConnectionMaker connectionMaker() {
		ConnectionMaker connect = new MysqlConnectionMaker();
		return connect;
	}
	
}
