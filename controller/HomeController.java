package com.DevApp.DevTah.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//import com.DevApp.DevTah.entity.Country;

@Controller
//@RequestMapping(value = "admin")
public class HomeController {

	 @RequestMapping(path = "home", method = RequestMethod.GET)
	    public String createCountry(Model model) {
	       model.addAttribute("home", new Object());
	        return "home.html";
	    }
}
