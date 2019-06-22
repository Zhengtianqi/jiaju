package com.tjnu.jiaju.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/druid")
public class DruidStatViewController {
	@RequestMapping("/index")
	public String index(Model model, HttpServletRequest request) {
		return "durid/index";
	}
	public static void main(String[] args) {
		
	}
}
