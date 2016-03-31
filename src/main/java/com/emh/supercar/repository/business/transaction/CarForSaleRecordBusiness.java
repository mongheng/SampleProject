package com.emh.supercar.repository.business.transaction;

import java.util.List;

import com.emh.supercar.model.transaction.CarForSaleRecord;

public interface CarForSaleRecordBusiness {

	public int createCar(CarForSaleRecord carForSaleRecord) throws Exception;
	public boolean updateCar(CarForSaleRecord carForSaleRecord) throws Exception;
	public boolean deleteCar(CarForSaleRecord carForSaleRecord) throws Exception;
	public CarForSaleRecord selectCar(int id) throws Exception;
	public List<CarForSaleRecord> selectAllCar() throws Exception;
}
