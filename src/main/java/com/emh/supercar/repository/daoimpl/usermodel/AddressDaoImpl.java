package com.emh.supercar.repository.daoimpl.usermodel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.emh.supercar.model.usermodel.Address;
import com.emh.supercar.repository.dao.usermodel.AddressDao;

@Repository
public class AddressDaoImpl implements AddressDao {

	//@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public int save(Address address) throws Exception {
		// TODO Auto-generated method stub
		return (Integer) hibernateTemplate.save(address);
	}

	@Override
	public boolean update(Address address) throws Exception {
		// TODO Auto-generated method stub
		hibernateTemplate.update(address);
		return true;
	}

	@Override
	public boolean delete(Address address) throws Exception {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(address);
		return true;
	}

	@Override
	public Address find(int id) throws Exception {
		// TODO Auto-generated method stub
		return (Address) hibernateTemplate.get(Address.class, id);
	}

	@Override
	public List<Address> findall() throws Exception {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<Address> addresses = (List<Address>)hibernateTemplate.find("from address");
		return addresses;
	}

}
