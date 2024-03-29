package com.lazyint.demo.spring_boot_ldap.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
	
	@Value("${welcome.message}")
    private String message;

   @GetMapping("/home")
    public String main(Model model) {
        model.addAttribute("message", message);
        return "welcome"; 
    }
}
