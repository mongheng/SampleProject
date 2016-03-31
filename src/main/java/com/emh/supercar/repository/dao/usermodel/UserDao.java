package com.emh.supercar.repository.dao.usermodel;

import java.util.List;

import com.emh.supercar.model.usermodel.User;

public interface UserDao {

	public int save(final User user) throws Exception;
	public boolean update(final User user) throws Exception;
	public boolean delete(final User user) throws Exception;
	public User find(final int id) throws Exception;
	public List<User> findall() throws Exception;
}
