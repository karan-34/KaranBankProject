 package com.mvc4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mvc4.repo.ProjectDao;

@Controller
public class ProjectControler {
	
	@Autowired
	private ProjectDao dao;
	
	
	
	@GetMapping("/home")  //mapping  homepage sw
	public String getHomepage() {
		return "homepage";
	}

	@GetMapping("/singup")
	public String signupMethod() {
		return "singup";
	}
	
	@GetMapping("/login")
	public String loginMethod() {
		return "login";
	}
	
	@PostMapping("/usersingup")// rp input tag k name  mw jo data hoga usko  method k argument vale variable mw set karega
	
	public String userSignup(@RequestParam("username") String name,
			@RequestParam("email") String mail,
			@RequestParam("password") String pass,
			@RequestParam("nickName") String nickName ,Model modle) {
		
	
		boolean result=dao.singup(name, mail, pass,nickName);
		if(result==true) {
			return "homepage";
		}else {
			modle.addAttribute("message","user already exist");
			return  "singup";
		}
	}
	
	@PostMapping("/userlogin")
	public String userlogin(@RequestParam("email") String mail,@RequestParam("password") String pass, Model model) {
		// tom cat return karega object model ka 
		
		boolean result=dao.login(mail, pass);
		if(result == true) {
			return "homepage";
		}else {
			model.addAttribute("message1", "invaild credentials");
			return "login";
		}
	
	}
	
	@GetMapping("/forgotpassword")
	public String getForgotPasswordForm() {
		return "forgotpassword";
	}
	
	
	@PostMapping("/forgotpasswordsubmit")
	public String forgotPassword(@RequestParam("email") String email,@RequestParam("nickname") String nickName ,Model model) {
		
		boolean result=dao.forgotPasswordSubmit(email, nickName);
		if(result == true) {
			
			model.addAttribute("usermail", email);
			return "resetpassword";
		}else {
			return "forgotpassword";
		}
	}
	
	@PostMapping("/passwordupdated")
	public String forgetDone(@RequestParam("usermail") String email ,@RequestParam("userpassword") String password, Model model) {
		
		boolean result=dao.passwordUpdated(email, password);
		if(result == true) {
		model.addAttribute("message2", "forgot password succsesfully ");
			return "homepage";	
		}else {
		return "resetpassword";
	}
		
	}

}
