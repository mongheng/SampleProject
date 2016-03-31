package com.emh.supercar.repository.daoimpl.transaction;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.emh.supercar.model.transaction.CarForSaleRecord;
import com.emh.supercar.repository.dao.transaction.CarForSaleRecordDao;

@Repository("carForSaleRecordDao")
public class CarForSaleRecordDaoImpl implements CarForSaleRecordDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public CarForSaleRecordDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int save(CarForSaleRecord carForSaleRecord) throws Exception {
		// TODO Auto-generated method stub
		return (Integer) hibernateTemplate.save(carForSaleRecord);
	}

	@Override
	public boolean update(CarForSaleRecord carForSaleRecord) throws Exception {
		// TODO Auto-generated method stub
		hibernateTemplate.update(carForSaleRecord);
		return true;
	}

	@Override
	public boolean delete(CarForSaleRecord carForSaleRecord) throws Exception {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(carForSaleRecord);
		return true;
	}

	@Override
	public CarForSaleRecord find(int id) throws Exception {
		// TODO Auto-generated method stub
		return (CarForSaleRecord) hibernateTemplate.get(CarForSaleRecord.class, id);
	}

	@Override
	public List<CarForSaleRecord> findall() throws Exception {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("unchecked")
		List<CarForSaleRecord> carForSaleRecords = (List<CarForSaleRecord>) hibernateTemplate.find("from CarForSaleRecord");
		return carForSaleRecords;
	}

}
