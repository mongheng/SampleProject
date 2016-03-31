package com.emh.supercar.repository.business.usermodel;

import java.util.List;

import com.emh.supercar.model.usermodel.Employee;

public interface EmployeeBusiness {

	public int createEmployee(Employee employee) throws Exception;
	public boolean updateEmployee(Employee employee) throws Exception;
	public boolean deleteEmployee(Employee employee) throws Exception;
	public Employee selectEmployee(int id) throws Exception;
	public List<Employee> selectAllEmployee() throws Exception;
	
}
