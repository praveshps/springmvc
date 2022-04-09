package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {
	
	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}
	
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(
			@RequestParam("email") String userEmail,
			@RequestParam("username") String userName,
			@RequestParam("password") String userPassword,
			Model model) {
				System.out.println("User email "+ userEmail);
				System.out.println("User email "+ userName);
				System.out.println("User email "+ userPassword);
				
			model.addAttribute("name",userName);
			model.addAttribute("email",userEmail);
			model.addAttribute("password",userPassword);
				
		return "success";
	}
}
