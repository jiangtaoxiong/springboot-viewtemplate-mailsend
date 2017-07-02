package com.lincoln.springboot.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    @Value("${application.message:Hello World}")
    private String message = "Hello World";
    
    
    @RequestMapping("/login")
    public String welcome(Map<String, Object> model) {
        model.put("time", new Date());
        model.put("message", this.message);
        return "index";
    }

	@RequestMapping(value = "/hello", method = RequestMethod.GET)

	public String welcome() {

		return "index1";
	}
	@RequestMapping(value = "/tmf", method = RequestMethod.GET)

	public String tmf() {

		return "tmf";
	}
	/*
	 * public ModelAndView hello() {
	 * 
	 * return new ModelAndView("index2"); }
	 */
}
