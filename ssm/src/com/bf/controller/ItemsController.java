package com.bf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bf.pojo.Items;
import com.bf.service.ItemsService;

@Controller
public class ItemsController {
	
	@Autowired
	private ItemsService itemsService;
	
	
	@RequestMapping("/list")
	public ModelAndView itemsList() {
		List<Items> itemsList = itemsService.getItemsList();
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("itemList", itemsList);
		modelAndView.setViewName("itemList");
		return modelAndView;
	}
}
