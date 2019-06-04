package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.demo.repository.TeacherRepository;
@Controller
public class HomeController {
	@Autowired
	private  TeacherRepository  tr;
	@GetMapping("/login")
    public String index(Model model)
  {
		model.addAttribute("teacher_list", tr.findAll()); 
	     return "home";
  }
}


