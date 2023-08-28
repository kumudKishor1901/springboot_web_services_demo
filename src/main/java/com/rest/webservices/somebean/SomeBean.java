package com.rest.webservices.somebean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"field1","field2"})
public class SomeBean {
	
	private String field1;
	//@JsonIgnore
	private String field2;
	private String field3;
	private String field4;
	public SomeBean(String field1, String field2, String field3, String field4) {
		super();
		this.field1 = field1;
		this.field2 = field2;
		this.field3 = field3;
		this.field4 = field4;
	}
	public String getField1() {
		return field1;
	}
	public String getField2() {
		return field2;
	}
	public String getField3() {
		return field3;
	}
	public String getField4() {
		return field4;
	};
	

}
