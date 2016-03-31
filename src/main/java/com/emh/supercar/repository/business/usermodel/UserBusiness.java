package com.emh.supercar.repository.business.usermodel;

import java.util.List;

import com.emh.supercar.model.usermodel.User;

public interface UserBusiness {

	public int createUser(User user) throws Exception;
	public boolean updateUser(User user) throws Exception;
	public boolean deleteUser(User user) throws Exception;
	public User selectUser(int id) throws Exception;
	public List<User> selectAllUser() throws Exception;
	
}
