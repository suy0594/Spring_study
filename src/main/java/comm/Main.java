package comm;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import comm.dao.DaoFactory;
import comm.dao.NConnectionMaker;
import comm.dao.UserDao;
import comm.domain.User;

public class Main {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		ApplicationContext context =
				new AnnotationConfigApplicationContext(DaoFactory.class);
		
		UserDao dao = context.getBean("userDao", UserDao.class);
		
		User user = new User();
		user.setId(0);
		user.setName("백기선");
		user.setPassword("married");
		
		dao.add(user);
		
		System.out.println(user.getId() + " 등록 성공");
		
		User user2 = dao.get(user.getId());
		System.out.println(user2.getName());
		System.out.println(user2.getPassword());
		 
		System.out.println(user2.getId() + " 조회 성공");
		
	}
}