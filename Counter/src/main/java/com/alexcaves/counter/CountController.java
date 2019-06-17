package com.alexcaves.counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CountController {
	
	@RequestMapping("/")
	public String index(HttpSession session, Model model) {
	
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
			Integer currCount = (Integer)session.getAttribute("count");
			System.out.println("We are starting the count! Our count is at "+currCount+".");
		}
		Integer currCount = (Integer)session.getAttribute("count");
		currCount++;
		session.setAttribute("count", currCount);
		System.out.println("Our count is at "+currCount+".");
		
		return "index.jsp";
}

	@RequestMapping("/counter")
	public String counter(HttpSession session, Model model) {
		
		Integer currCount = (Integer)session.getAttribute("count");
		
		if (currCount == null) {
			model.addAttribute("count", 0);
		}
		
		else {
			model.addAttribute("count", currCount);
		}
		return "counter.jsp";
}
}
