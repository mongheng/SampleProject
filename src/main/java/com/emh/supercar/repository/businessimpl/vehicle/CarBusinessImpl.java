package com.emh.supercar.repository.businessimpl.vehicle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.emh.supercar.model.vehicle.Car;
import com.emh.supercar.repository.business.vehicle.CarBusiness;
import com.emh.supercar.repository.dao.vehicle.CarDao;

@Service("carBusiness")
@Transactional(propagation = Propagation.REQUIRED, readOnly = true)
public class CarBusinessImpl implements CarBusiness {
	
	@Autowired
	private CarDao carDao;

	public CarBusinessImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public int createCar(Car car) throws Exception {
		// TODO Auto-generated method stub
		return carDao.save(car);
	}

	@Override
	public boolean updateCar(Car car) throws Exception {
		// TODO Auto-generated method stub
		carDao.update(car);
		return true;
	}

	@Override
	public boolean deleteCar(Car car) throws Exception {
		// TODO Auto-generated method stub
		carDao.delete(car);
		return true;
	}

	@Override
	public Car selectCar(int id) throws Exception {
		// TODO Auto-generated method stub
		return carDao.find(id);
	}

	@Override
	public List<Car> selectAllCar() throws Exception {
		// TODO Auto-generated method stub
		return carDao.findall();
	}

}
