package com.nts.api.form;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class AddForm implements Serializable {
//	stock_id, name, unit_id, remarks,create_user
	private String stockId;
	private String name;
	private Integer unitId;
	private String remarks;
	private String createUser;
	private String updateUser;
	private String createDate;
	private String updateDate;
	
	

	

}




