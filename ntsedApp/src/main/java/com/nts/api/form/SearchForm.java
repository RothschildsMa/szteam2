package com.nts.api.form;

import java.io.Serializable;

import lombok.Data;
@Data
public class SearchForm implements Serializable{
	
	private String name;
	private Integer unitId;
	private String updateFrom;
	private String updateTo;

	

}
