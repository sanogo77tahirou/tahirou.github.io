package com.DevApp.DevTah.controller;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.DevApp.DevTah.entity.Country;
import com.DevApp.DevTah.repository.CountryRepository;
import com.DevApp.DevTah.service.CountryService;

@Controller
@RequestMapping(value = "admin")
public class CountryController {
	@Autowired
	private  CountryService CountryService;
	
    @RequestMapping(path = "/Country/add", method = RequestMethod.GET)
    public String createCountry(Model model) {
        //User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	 //  model.addAttribute("user", user);
	   model.addAttribute("Country", new Country());
        return "admin/saveCountry.html";
    }
    
    @RequestMapping(path = "/Country/add", method = RequestMethod.POST)
    public String saveCountry(Country Country,Model model ) {
    //      User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	//model.addAttribute("user", user);
	
        model.addAttribute("Country", new Country());
     
        CountryService.save(Country);
        return "redirect:/admin/Country";
      
               
    }
    
    @RequestMapping(path = "/Country", method = RequestMethod.GET)
    public String getAllCountry(Model model) {
        
         List<Country> allCountry = (List<Country>) CountryService.findAll();
        model.addAttribute("allCountry", allCountry);
         model.addAttribute("Country", new Country());  
        
       //User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	//model.addAttribute("user", user);
	 return "admin/Country.html";
 }
}
