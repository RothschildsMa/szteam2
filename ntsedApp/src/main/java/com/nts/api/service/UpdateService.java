package com.nts.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nts.api.dao.UpdateMapper;
import com.nts.api.entity.Stock;
import com.nts.api.form.AddForm;
import com.nts.api.form.UpdateForm;

@Service
public class UpdateService {
	
	@Autowired
	private UpdateMapper updateMapper;

	public void getStockId(AddForm addForm) {
		
		Number newNumber = Number.class.cast(Integer.parseInt(updateMapper.getMaxId()) + 1);
		
		String stockIdString = "000000" + newNumber.toString();
		
		String stockNewId = stockIdString.substring(stockIdString.length() - 6);
		
		addForm.setStockId(stockNewId);
		
		
	}
	
	public void addStockInfo(AddForm addForm) {
		addForm.setCreateUser("zsw");
		updateMapper.insert(addForm);
		
	}
	
	public Stock getById(String stockId) {
		
		return updateMapper.getStockById(stockId);
	}
	
	
	public void updateStockInfo(AddForm addForm) {
		updateMapper.update(addForm);
		
	}
	


	

}


