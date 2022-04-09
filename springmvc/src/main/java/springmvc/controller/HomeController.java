package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("......................................................this is home page");
		
		model.addAttribute("name", "Pravesh Singh");
		model.addAttribute("id", 123);
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("this is home page");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("this is help page");
		ModelAndView modelandview = new ModelAndView();
		modelandview.addObject("name", "Uttam Singh");
		modelandview.addObject("roll", 12345);
		modelandview.setViewName("help");
		
		return modelandview;
	}
}