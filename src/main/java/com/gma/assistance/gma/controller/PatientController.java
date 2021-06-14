package com.gma.assistance.gma.controller;
import com.gma.assistance.gma.entity.Country;
import com.gma.assistance.gma.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

//@RestController
@Controller
@RequestMapping("/patient")
public class PatientController {
    @Autowired
    private CountryRepository countryRepository;

//    @GetMapping("/")
//    public List<Country> country() {
//        // After user login successfully.
//        //String userName = principal.getName();
////        System.out.println("User Name: " + userName+" "+securityService.isAuthenticated());
//        //model.addAttribute("profile", false);
//
//        return countryRepository.findAll();
//    }
    
    @GetMapping("/")
    public String profile(Model model, Principal principal) {
        // After user login successfully.
        //String userName = principal.getName();
//        System.out.println("User Name: " + userName+" "+securityService.isAuthenticated());
        //model.addAttribute("profile", false);

        return "patient/index";
    }
}
