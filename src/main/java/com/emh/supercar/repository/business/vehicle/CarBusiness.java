package com.emh.supercar.repository.business.vehicle;

import java.util.List;

import com.emh.supercar.model.vehicle.Car;

public interface CarBusiness {

	public int createCar(Car car) throws Exception;
	public boolean updateCar(Car car) throws Exception;
	public boolean deleteCar(Car car) throws Exception;
	public Car selectCar(int id) throws Exception;
	public List<Car> selectAllCar() throws Exception;
}
