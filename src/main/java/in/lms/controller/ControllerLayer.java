package in.lms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerLayer {
	
	 @GetMapping("/login")
	    public String loginPage() {
	        return "login"; // login.html
	    }

	    @GetMapping("/home")
	    public String homePage() {
	        return "home"; // home.html
	    }

}
