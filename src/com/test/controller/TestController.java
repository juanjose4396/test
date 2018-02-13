package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	@RequestMapping(value = "/welcome")
	public ModelAndView helloWorld() {
 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java **********</div><br><br>";
		return new ModelAndView("welcome", "message", message);
	}
	@RequestMapping(value = "/")
	public String index() {
		return "../index";
	}
	/*@Controller
	public class HelloWorldController {

	    @RequestMapping("/helloWorld")
	    public String helloWorld(Model model) {
	        model.addAttribute("message", "Hello World!");
	        return "helloWorld";
	    }
	}*/
}
