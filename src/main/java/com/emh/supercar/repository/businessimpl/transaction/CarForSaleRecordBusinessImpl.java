package com.emh.supercar.repository.businessimpl.transaction;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.emh.supercar.model.transaction.CarForSaleRecord;
import com.emh.supercar.repository.business.transaction.CarForSaleRecordBusiness;
import com.emh.supercar.repository.dao.transaction.CarForSaleRecordDao;

@Service("carForSaleRecordBusiness")
@Transactional(propagation = Propagation.REQUIRED, readOnly = true)
public class CarForSaleRecordBusinessImpl implements CarForSaleRecordBusiness {
	
	@Autowired
	private CarForSaleRecordDao carForSaleRecordDao;

	public CarForSaleRecordBusinessImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public int createCar(CarForSaleRecord carForSaleRecord) throws Exception {
		// TODO Auto-generated method stub
		return carForSaleRecordDao.save(carForSaleRecord);
	}

	@Override
	public boolean updateCar(CarForSaleRecord carForSaleRecord) throws Exception {
		// TODO Auto-generated method stub
		carForSaleRecordDao.update(carForSaleRecord);
		return true;
	}

	@Override
	public boolean deleteCar(CarForSaleRecord carForSaleRecord) throws Exception {
		// TODO Auto-generated method stub
		carForSaleRecordDao.delete(carForSaleRecord);
		return true;
	}

	@Override
	public CarForSaleRecord selectCar(int id) throws Exception {
		// TODO Auto-generated method stub
		CarForSaleRecord carForSaleRecord = carForSaleRecordDao.find(id);
		return carForSaleRecord;
	}

	@Override
	public List<CarForSaleRecord> selectAllCar() throws Exception {
		// TODO Auto-generated method stub
		List<CarForSaleRecord> carForSaleRecords = carForSaleRecordDao.findall();
		return carForSaleRecords;
	}

}
