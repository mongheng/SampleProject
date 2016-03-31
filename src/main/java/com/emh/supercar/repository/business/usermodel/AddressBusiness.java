package com.emh.supercar.repository.business.usermodel;

import java.util.List;

import com.emh.supercar.model.usermodel.Address;

public interface AddressBusiness {

	public int createAddress(Address address) throws Exception;
	public boolean updateAddress(Address address) throws Exception;
	public boolean deleteAddress(Address address) throws Exception;
	public Address selectAddress(int id) throws Exception;
	public List<Address> selectAllAddress() throws Exception;
	
}
