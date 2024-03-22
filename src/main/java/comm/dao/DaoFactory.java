package comm.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoFactory {
	@Bean
	public UserDao userDao() {
		NConnectionMaker nConnectionMaker =  new NConnectionMaker();
		UserDao userDao = new UserDao(nConnectionMaker);
		return userDao;
	}
	
	@Bean
	public ConnectionMaker connectionMaker() {
		NConnectionMaker nConnectionMaker = new NConnectionMaker();
		return nConnectionMaker;
	}
}
