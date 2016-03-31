package com.emh.supercar.repository.dao.usermodel;

import java.util.List;

import com.emh.supercar.model.usermodel.Address;

public interface AddressDao {

	public int save(final Address address) throws Exception;
	public boolean update(final Address address) throws Exception;
	public boolean delete(final Address address) throws Exception;
	public Address find(final int id) throws Exception;
	public List<Address> findall() throws Exception;
	
}
