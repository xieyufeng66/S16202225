package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
   public class TaskController {
	@GetMapping("/test")
       public String index(Model model)
     {
	     return "ajax";
     }
   }

