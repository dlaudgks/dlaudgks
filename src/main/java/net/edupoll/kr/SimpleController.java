package net.edupoll.kr;

import org.springframework.stereotype.Controller;

@Controller
public class SimpleController {
 
	public String defaultHandle() {
		
		return "home";
	}
	
}
