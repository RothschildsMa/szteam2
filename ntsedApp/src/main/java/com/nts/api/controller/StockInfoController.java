package com.nts.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.nts.api.entity.Stock;
import com.nts.api.form.SearchForm;
import com.nts.api.service.StockService;

@Controller
public class StockInfoController {
	@Autowired
	private StockService stockService;
	@GetMapping("/info")
	public String stockInfo(Model model,SearchForm searchForm) {
		List<Stock> stockList = stockService.getStocks();
		model.addAttribute("stockList", stockList);
		return "stockList";
	}
	@PostMapping("/search")
	public String stockCond(SearchForm searchForm , Model model) {
		List<Stock> stockList = stockService.getStockByCond(searchForm);
		model.addAttribute("stockList", stockList);
		return "stockList";
		
	}
	@GetMapping("/{id}/delete")
	public String stockDelete(@PathVariable String id, Model model) {
		stockService.delete(id);
		return "redirect:/info";
	}
	
	
	
	
	
	

}
