package com.emh.supercar.repository.businessimpl.usermodel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.emh.supercar.model.usermodel.User;
import com.emh.supercar.repository.business.usermodel.UserBusiness;
import com.emh.supercar.repository.dao.usermodel.UserDao;

@Service
//@Transactional
public class UserBusinessImpl implements UserBusiness {

	//@Autowired
	private UserDao userdao;

	@Override
	public int createUser(User user) throws Exception {
		// TODO Auto-generated method stub
		return userdao.save(user);
	}

	@Override
	public boolean updateUser(User user) throws Exception {
		// TODO Auto-generated method stub
		userdao.update(user);
		return true;
	}

	@Override
	public boolean deleteUser(User user) throws Exception {
		// TODO Auto-generated method stub
		userdao.delete(user);
		return true;
	}

	@Override
	@Transactional(readOnly=true)
	public User selectUser(int id) throws Exception {
		// TODO Auto-generated method stub
		return userdao.find(id);
	}

	@Override
	@Transactional(readOnly=true)
	public List<User> selectAllUser() throws Exception {
		// TODO Auto-generated method stub
		return userdao.findall();
	}

}
