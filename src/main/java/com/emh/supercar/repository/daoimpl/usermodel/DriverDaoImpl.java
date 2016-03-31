package com.emh.supercar.repository.daoimpl.usermodel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.emh.supercar.model.usermodel.Driver;
import com.emh.supercar.repository.dao.usermodel.DriverDao;

@Repository
public class DriverDaoImpl implements DriverDao {

	//@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public int save(Driver driver) throws Exception {
		// TODO Auto-generated method stub
		return (Integer) hibernateTemplate.save(driver);
	}

	@Override
	public boolean update(Driver driver) throws Exception {
		// TODO Auto-generated method stub
		hibernateTemplate.update(driver);
		return true;
	}

	@Override
	public boolean delete(Driver driver) throws Exception {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(driver);
		return true;
	}

	@Override
	public Driver find(int id) throws Exception {
		// TODO Auto-generated method stub
		return (Driver) hibernateTemplate.get(Driver.class, id);
	}

	@Override
	public List<Driver> findall() throws Exception {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<Driver> drivers = (List<Driver>)hibernateTemplate.find("from driver");
		return drivers;
	}

}
