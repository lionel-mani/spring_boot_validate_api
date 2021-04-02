package com.mani.springBoot.controller;



import javax.websocket.server.PathParam;

import org.springframework.http.MediaType;
import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mani.springBoot.model.RequestData;

@RestController
@Validated
public class ValidationContoller {
	@GetMapping(value="/validate")
	@ResponseBody
	public String getData(@RequestParam("data") @NonNull String data) {
		System.out.println("in method getData(): "+data);
		return data;  
	}
	
	@PostMapping(value = "/postValidate", consumes = {MediaType.ALL_VALUE})
	public String getPostData(@RequestBody RequestData data) {
		System.out.println("in method getPostData: "+data.getData());
		return data.getData();
	}
	
}
