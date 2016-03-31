package com.emh.supercar.repository.dao.usermodel;

import java.util.List;

import com.emh.supercar.model.usermodel.Employee;

public interface EmployeeDao {

	public int save(final Employee employee) throws Exception;
	public boolean update(final Employee employee) throws Exception;
	public boolean delete(final Employee employee) throws Exception;
	public Employee find(final int id) throws Exception;
	public List<Employee> findall() throws Exception;
}
