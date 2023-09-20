package com.nts.api.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

import com.nts.api.entity.Unit;
import com.nts.api.form.UpdateForm;

@Mapper
public interface UnitMapper {
	
	List<Unit> getUnit();

}


