package com.mani.springBoot.model;

import org.springframework.lang.NonNull;

public class RequestData {

	@NonNull
	private String data;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
}
