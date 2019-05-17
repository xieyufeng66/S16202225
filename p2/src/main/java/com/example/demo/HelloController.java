package com.example.demo;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
 @Controller
public class HelloController {	
	 @Value("${welcome.message}")
	    private String message;
	 @Value("liu ke qin my son")
	 private  String test;
	    private List<String> tasks = Arrays.asList("Git", "Maven", "Gradle", "Spring", "Bootstrap", "jQuery", "MyBatis","Redis");
	    @GetMapping("/")
		public String index(Model model) {
	    	model.addAttribute("message", message);
	        model.addAttribute("tasks", tasks);
			return "welcome";		
		}
	    @GetMapping("/second")
		public String indexTwo(Model model1) {
	    	model1.addAttribute("test", test);
	    	return "second";
		}
	   @PostMapping("add")
	  public String  doAdd(int a,int b,Model model)
	  {
	    	System.out.println(a+b);
	    	model.addAttribute("a",a);
	    	model.addAttribute("b",b);
	    	
	    	model.addAttribute("result",a+b);
		  return  index(model);
	  }

}	
