package com.crudjava.entity;

public enum MaritalStatus {
	SINGLE("SINGLE"), 
	MARRIED("MARRIED"),
	DIVORCED("DIVORCED");

	private String value;

	private MaritalStatus(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value;
	}
}