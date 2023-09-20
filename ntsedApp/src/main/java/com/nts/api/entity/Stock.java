package com.nts.api.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class Stock implements Serializable{
	
	private String stockId;
	private String name;
	private Integer unitId;
	private Integer stockNum;
	private String unitName;
	private String remarks;
	private String createUser;
	private String updateUser;
	private String createDate;
	private Date updateDate;
}
