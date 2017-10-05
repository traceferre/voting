package com.libertymutual.goforcode.voting.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.libertymutual.goforcode.voting.models.User;
import com.libertymutual.goforcode.voting.services.UserRepository;

@Controller
@RequestMapping("/")
public class VotingController {
	
	private UserRepository userRepo;
	
	public VotingController (UserRepository userRepo) {
		this.userRepo = userRepo;
	}

	@GetMapping("")
	public String sendToTimeSheet() {
		return "/default";
	}
	
	@PostMapping("/user")
	public ModelAndView selectAUser(String name) {
		ModelAndView mv = new ModelAndView("/default");
		User user = new User(name);
		userRepo.save(user);
		mv.addObject("user", user.getUserName());
		return mv;
	}
	
	@PostMapping("/vote")
	public ModelAndView doSomeVoting() {
		ModelAndView mv = new ModelAndView("/default");
		return mv;
	}
	
	
}
