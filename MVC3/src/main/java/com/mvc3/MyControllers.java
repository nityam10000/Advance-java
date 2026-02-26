package com.mvc3;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mvc3.database.controller.DatabaseController;
import com.mvc3.database.entity.UserDetails;

@Controller
public class MyControllers {
	
	private DatabaseController dc;
	
	@RequestMapping("/register")
	public String giveLogin(@ModelAttribute UserDetails userdetails) {
		
		dc = new DatabaseController();
		
		dc.registerUser(userdetails.getUserName(), userdetails.getEmail());
		
		System.out.println(userdetails.getUserName()+" "+userdetails.getEmail());
		
		ModelAndView mv = new ModelAndView();
		
		return "redirect:/findAll";
	}
	
	@RequestMapping("/findUser")
	public ModelAndView findTheUser(@RequestParam(value = "userId") int userId) {
		
		dc = new DatabaseController();
		
//		dc.rUser(userN, emaill);
		String[] userDetails = dc.findU(userId).split(" ");
		
		
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("username", userDetails[0]);
		mv.addObject("email", userDetails[1]);
		mv.setViewName("display.jsp");
		
		return mv;
	}
	
	@RequestMapping("/user")
	public String giveUserDetails(Model model) {
		model.addAttribute("name", "Nityam");
		model.addAttribute("email", "nityamsalgotra900@gmail.com");
		return "user.jsp";
	}
	
	@RequestMapping("/vs")
	public String homePage() {
		return "homepage";
	}
	
	@RequestMapping("/login")
	public String giveReg(Model model) {
		model.addAttribute("user", new UserDetails());
		return "login";
	}
	
	@RequestMapping("/findAll")
	public String giveAllUsers(Model model) {
		dc = new DatabaseController();
		List<UserDetails> users = dc.findAllUsers();
		
		System.out.println(users);
		model.addAttribute("list",users);
		
		return "display";
	}
	
	@RequestMapping("/delete")
	public String deleteUser(@RequestParam("userId") int userId) {
		dc = new DatabaseController();
		
		dc.deleteUser(userId);
		
		return "redirect:/findAll";
	}
}
