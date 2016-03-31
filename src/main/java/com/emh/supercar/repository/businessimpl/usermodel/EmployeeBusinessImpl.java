package com.emh.supercar.repository.businessimpl.usermodel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.emh.supercar.model.usermodel.Employee;
import com.emh.supercar.repository.business.usermodel.EmployeeBusiness;
import com.emh.supercar.repository.dao.usermodel.EmployeeDao;

@Service
@Transactional
public class EmployeeBusinessImpl implements EmployeeBusiness {

	//@Autowired
	private EmployeeDao employeedao;
	
	@Override
	public int createEmployee(Employee employee) throws Exception {
		// TODO Auto-generated method stub
		return employeedao.save(employee);
	}

	@Override
	public boolean updateEmployee(Employee employee) throws Exception {
		// TODO Auto-generated method stub
		employeedao.update(employee);
		return true;
	}

	@Override
	public boolean deleteEmployee(Employee employee) throws Exception {
		// TODO Auto-generated method stub
		employeedao.delete(employee);
		return true;
	}

	@Override
	public Employee selectEmployee(int id) throws Exception {
		// TODO Auto-generated method stub
		return employeedao.find(id);
	}

	@Override
	public List<Employee> selectAllEmployee() throws Exception {
		// TODO Auto-generated method stub
		return employeedao.findall();
	}

}
