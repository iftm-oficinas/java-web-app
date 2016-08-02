package domain.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import domain.services.UserService;
import domain.entities.User;

import java.util.*;

@Controller
public class MainController {

    @Autowired
    private UserService userService;
    
    @RequestMapping("/")
    String index(Model model) {
        HashMap response = new HashMap();
        userService.insert("marlonmacf@gmail.com", "Marlon Andrel", "*****");
        response.put("users", userService.fetchAll());
        model.addAttribute("users", response.get("users"));
        
        return "main/index";
    }
}