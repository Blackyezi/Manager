package com.yezi.shiro.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/admin")
public class DeptController {
	
	@RequestMapping(value ="/test")
	public String info(ModelMap map){
		String tets = "测试数据";
		map.addAttribute(tets, "test");
		return "test";
	}
}
