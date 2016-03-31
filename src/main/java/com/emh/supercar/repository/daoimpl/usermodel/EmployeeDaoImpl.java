package com.emh.supercar.repository.daoimpl.usermodel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.emh.supercar.model.usermodel.Employee;
import com.emh.supercar.repository.dao.usermodel.EmployeeDao;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	//@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public int save(Employee employee) throws Exception {
		// TODO Auto-generated method stub
		return (Integer) hibernateTemplate.save(employee);
	}

	@Override
	public boolean update(Employee employee) throws Exception {
		// TODO Auto-generated method stub
		hibernateTemplate.update(employee);
		return true;
	}

	@Override
	public boolean delete(Employee employee) throws Exception {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(employee);
		return true;
	}

	@Override
	public Employee find(int id) throws Exception {
		// TODO Auto-generated method stub
		return (Employee)hibernateTemplate.get(Employee.class, id);
	}

	@Override
	public List<Employee> findall() throws Exception {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<Employee> employees = (List<Employee>)hibernateTemplate.find("from employee");
		return employees;
	}

}
