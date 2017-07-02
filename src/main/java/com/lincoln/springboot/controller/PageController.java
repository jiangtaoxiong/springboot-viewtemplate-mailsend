package com.lincoln.springboot.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lincoln.springboot.entity.Customer;

@Controller
@RequestMapping("/page")
public class PageController {
  
	@RequestMapping("/index")
	public String getCustomerList(ModelMap modelMap){
		modelMap.addAttribute("name", "lincoln");
		return "index2";
	}
	@RequestMapping("/customers")
	public String customers(ModelMap modelMap){
		List<Customer> cc = new ArrayList<Customer>();
		cc.add(new Customer(9, "9", 9));
		cc.add(new Customer(9, "9", 9));
		cc.add(new Customer(9, "9", 9));
		modelMap.addAttribute("data", cc);
		return "customers";
	}
}
