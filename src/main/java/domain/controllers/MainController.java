package domain.controllers;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import domain.services.UserService;

@Controller
public class MainController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	String index() {
		return "main/index";
	}
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	String home() {
		return "main/index";
	}

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	String fetch(Model model) {
		HashMap<String, Object> response = new HashMap<String, Object>();
		response.put("users", userService.fetchAll());
		model.addAttribute("users", response.get("users"));
		return "main/index";
	}

	@RequestMapping(value = "/user/store", method = RequestMethod.GET)
	String store(Model model) {
		HashMap<String, Object> response = new HashMap<String, Object>();
		try {
			userService.insert("marlonmacf@gmail.com", "Marlon Andrel", "*****");
		}
		catch (Exception e) {
			System.out.println(e);
		}
		response.put("users", userService.fetchAll());
		model.addAttribute("users", response.get("users"));
		return "main/index";
	}
}
