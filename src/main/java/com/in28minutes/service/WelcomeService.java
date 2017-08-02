package com.in28minutes.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import com.in28minutes.springboot.configuration.BasicConfiguration;

@Component
public class WelcomeService{
	
	@Value("${welcome.message}")
	private String welcomeMsg;
	
	public String getWelcomeMessage(){
		return welcomeMsg;
	}
	
	@Autowired
	private BasicConfiguration basicConfiguration;
	
	@RequestMapping("/dynamic-configuration")
	public Map dynamicConfiguration(){
	 Map map = new HashMap();
	 map.put("message", basicConfiguration.getMessage());
	 map.put("number", basicConfiguration.getNumber());
	 map.put("value", basicConfiguration.isValue());
	 return map;
	}
}