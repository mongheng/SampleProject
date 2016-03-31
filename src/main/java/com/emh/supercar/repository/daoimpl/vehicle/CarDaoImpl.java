package com.emh.supercar.repository.daoimpl.vehicle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.emh.supercar.model.vehicle.Car;
import com.emh.supercar.repository.dao.vehicle.CarDao;

@Repository("carDao")
public class CarDaoImpl implements CarDao {

	@Autowired
	HibernateTemplate hibernateTemplate;
	
	public CarDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int save(Car car) throws Exception {
		// TODO Auto-generated method stub
		return  (Integer) hibernateTemplate.save(car);
	}

	@Override
	public boolean update(Car car) throws Exception {
		// TODO Auto-generated method stub
		hibernateTemplate.update(car);
		return true;
	}

	@Override
	public boolean delete(Car car) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Car find(int id) throws Exception {
		// TODO Auto-generated method stub
		return (Car) hibernateTemplate.get(Car.class, id);
	}

	@Override
	public List<Car> findall() throws Exception {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("unchecked")
		List<Car> cars = (List<Car>) hibernateTemplate.find("from Car");
		return cars;
	}

}
