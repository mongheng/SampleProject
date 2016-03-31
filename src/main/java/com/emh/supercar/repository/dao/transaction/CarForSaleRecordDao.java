package com.emh.supercar.repository.dao.transaction;

import java.util.List;

import com.emh.supercar.model.transaction.CarForSaleRecord;

public interface CarForSaleRecordDao {

	public int save(final CarForSaleRecord carForSaleRecord) throws Exception;
	public boolean update(final CarForSaleRecord carForSaleRecord) throws Exception;
	public boolean delete(final CarForSaleRecord carForSaleRecord) throws Exception;
	public CarForSaleRecord find(final int id) throws Exception;
	public List<CarForSaleRecord> findall() throws Exception;
}
