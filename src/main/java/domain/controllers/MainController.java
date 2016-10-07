package domain.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import domain.services.UserService;
import domain.entities.User;

import java.util.*;

@Controller
public class MainController {

    @Autowired
    private UserService userService;
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    String index() {   
        return "main/index";
    }
    
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    String fetch(Model model) {
        HashMap response = new HashMap();
        
        response.put("users", userService.fetchAll());
        model.addAttribute("users", response.get("users"));
        
        return "main/index";
    }
    
    @RequestMapping(value = "/user/store", method = RequestMethod.GET)
    String store(Model model) {
        HashMap response = new HashMap();
        
        try {
            userService.insert("marlonmacf@gmail.com", "Marlon Andrel", "*****");
        } catch (Exception e) {
            System.out.println(e);
        }
        
        response.put("users", userService.fetchAll());
        model.addAttribute("users", response.get("users"));
        
        return "main/index";
    }
}