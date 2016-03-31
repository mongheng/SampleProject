package com.emh.supercar.repository.businessimpl.usermodel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.emh.supercar.model.usermodel.Address;
import com.emh.supercar.repository.business.usermodel.AddressBusiness;
import com.emh.supercar.repository.dao.usermodel.AddressDao;

@Service
@Transactional
public class AddressBusinessImpl implements AddressBusiness {

	//@Autowired
	private AddressDao addressdao;
	
	@Override
	public int createAddress(Address address) throws Exception {
		// TODO Auto-generated method stub
		return addressdao.save(address);
	}

	@Override
	public boolean updateAddress(Address address) throws Exception {
		// TODO Auto-generated method stub
		addressdao.update(address);
		return true;
	}

	@Override
	public boolean deleteAddress(Address address) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Address selectAddress(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Address> selectAllAddress() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
