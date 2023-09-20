package com.nts.api.form;

import java.io.Serializable;

import lombok.Data;


@Data
public class UpdateForm implements Serializable {
	private String stockId;
	private String name;
	private Integer unitId;
	private String remarks;

	}



	