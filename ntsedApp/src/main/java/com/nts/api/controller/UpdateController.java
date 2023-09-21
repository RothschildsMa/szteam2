package com.nts.api.controller;

import java.util.Arrays;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.fasterxml.jackson.annotation.ObjectIdGenerators.StringIdGenerator;
import com.nts.api.dao.UnitMapper;
import com.nts.api.entity.Stock;
import com.nts.api.form.AddForm;
import com.nts.api.form.UpdateForm;
import com.nts.api.service.UpdateService;

@Controller
public class UpdateController {

	@Autowired
	private UpdateService updateService;

	@Autowired
	private UnitMapper unitMapper;

	@GetMapping("/add")
	public String view1(AddForm addForm, Model model) {

		updateService.getStockId(addForm);

		model.addAttribute("unitList", unitMapper.getUnit());

//		addForm.setUnitList(Arrays.asList("個","台","本","冊","皿","箱","足","件"));

		return "zsw";
	}

	@PostMapping("/insert")
	public String view2(AddForm addForm) {

		updateService.addStockInfo(addForm);
		return "redirect:/info";

	}

	
	@GetMapping("/{id}/update")
	public String view3(@PathVariable String id, Model model, AddForm addForm) {

		Stock stock = updateService.getById(id);
		addForm.setStockId(stock.getStockId());
		addForm.setName(stock.getName());
		addForm.setUnitId(stock.getUnitId());
		addForm.setRemarks(stock.getRemarks());
		model.addAttribute("addForm", addForm);
		model.addAttribute("unitList", unitMapper.getUnit());

		return "zsw";

	}

	@PostMapping("/update")
	public String view3(AddForm addForm) {

		updateService.updateStockInfo(addForm);
		return "redirect:/info";

	}

}
