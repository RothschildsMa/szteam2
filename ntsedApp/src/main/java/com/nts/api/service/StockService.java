package com.nts.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nts.api.dao.StockMapper;
import com.nts.api.entity.Stock;
import com.nts.api.form.SearchForm;

@Service
public class StockService {
	@Autowired
	private StockMapper stockMapper;
	
	public List<Stock> getStocks(){
		return stockMapper.getStock();
	}
	public List<Stock> getStockByCond(SearchForm searchForm){
		return stockMapper.getStockByCond(searchForm);
	}
	public void delete(String id){
		stockMapper.delete(id);
	}

}
