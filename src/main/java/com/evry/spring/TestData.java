package com.evry.spring;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
@com.google.code.morphia.annotations.Entity
public class TestData {

	@Id
	private String id;

	@Field(value = "a")
	private String name;

	@Field
	private String b;

	private NestedTestData nestedTestData;

	public TestData() {

	}

	public void setNestedTestData(NestedTestData nestedTestData) {
		this.nestedTestData = nestedTestData;
	}

	public NestedTestData getNestedTestData() {
		return nestedTestData;
	}

	public String getA() {
		return name;
	}

	public void setA(String a) {
		this.name = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

}
