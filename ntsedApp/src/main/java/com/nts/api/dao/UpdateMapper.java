package com.nts.api.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

import com.nts.api.entity.Stock;
import com.nts.api.form.AddForm;
import com.nts.api.form.UpdateForm;
@Mapper
public interface UpdateMapper {

	void insert(AddForm addForm);
	
	String getMaxId();
	
	Stock getStockById(String id);
	
	void update(AddForm addForm);
	
	
	
	
}




