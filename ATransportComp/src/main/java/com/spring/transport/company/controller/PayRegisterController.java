package com.spring.transport.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.transport.company.service.IPayRegisterService;

public class PayRegisterController {

	@Autowired
	IPayRegisterService ipayRegisterService;

	@RequestMapping(value = "/afindname",method = RequestMethod.GET)
	public String showTodos(ModelMap model) {
		String manager = getLoggedInUserName(model);
		model.put("payregister",ipayRegisterService .getPayRegisterByManger(manager));

		return "afindname";
	}

	private String getLoggedInUserName(ModelMap model) {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		if (principal instanceof UserDetails) {
			return ((UserDetails) principal).getUsername();
		}

		return principal.toString();
	}

}
