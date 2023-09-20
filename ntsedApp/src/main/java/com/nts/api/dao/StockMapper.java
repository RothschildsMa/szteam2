package com.nts.api.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.nts.api.entity.Stock;
import com.nts.api.form.SearchForm;

@Mapper
public interface StockMapper {
	//和xml文件中的属性一致
	List<Stock> getStock();
	List<Stock> getStockByCond(SearchForm searchForm);
	void delete(String id);
}
