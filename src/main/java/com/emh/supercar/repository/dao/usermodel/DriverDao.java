package com.emh.supercar.repository.dao.usermodel;

import java.util.List;

import com.emh.supercar.model.usermodel.Driver;

public interface DriverDao {
	
	public int save(final Driver driver) throws Exception;
	public boolean update(final Driver driver) throws Exception;
	public boolean delete(final Driver driver) throws Exception;
	public Driver find(final int id) throws Exception;
	public List<Driver> findall() throws Exception;
}
