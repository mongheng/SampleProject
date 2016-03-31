package com.emh.supercar.repository.daoimpl.usermodel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.emh.supercar.model.usermodel.User;
import com.emh.supercar.repository.dao.usermodel.UserDao;

@Repository
public class UserDaoImpl implements UserDao {

	/*@Autowired
	private SessionFactory sessionFactory;*/
	//@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public int save(User user) throws Exception{
		// TODO Auto-generated method stub
		
		/*Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();*/
		return (Integer)hibernateTemplate.save(user);
	}

	@Override
	public boolean update(User user) throws Exception{
		// TODO Auto-generated method stub
		hibernateTemplate.update(user);
		return true;
	}

	@Override
	public boolean delete(User user) throws Exception{
		// TODO Auto-generated method stub
		hibernateTemplate.delete(user);
		return true;
	}

	@Override
	public User find(int id) throws Exception{
		// TODO Auto-generated method stub
		
		return (User) hibernateTemplate.get(User.class, id);
	}

	@Override
	public List<User> findall() throws Exception{
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<User> users = (List<User>)hibernateTemplate.find("from user");
		
		return users;
	}

}
