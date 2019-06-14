package webadv.s16202109.lab3;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import webadv.s16202109.lab3.entity.User;
import webadv.s16202109.lab3.respository.UserRepository;

@Controller
public class HomeController implements WebMvcConfigurer {
	@Autowired
	private UserRepository userpo;
	
	
	@Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/home").setViewName("welcome");
    }
	@GetMapping("/")//只接受get方式的请求
	public String login(Model model,String account,String password) {
			model.addAttribute("user",new User());
			return "login";
	}
	@PostMapping("/login")//只接受post方式的请求
	public String check(@Validated User user, BindingResult bindingResult, Model model) {
		User user2=userpo.validUser(user.getAccount(),user.getPassword());
		if (bindingResult.hasFieldErrors()) {
			model.addAttribute(user);	 
			return "login";
		}else if(user2==null) {
			return "login_error";
		}else {
			model.addAttribute("user_list",userpo.validUser(user.getAccount(),user.getPassword()));
			 return "welcome";
		}
	}
	
	@GetMapping("/register")
	public String Register(Model model) {
		model.addAttribute("user", new User());
		return "register";
	}
	
	@PostMapping("/register")
    public String Register(@Validated User user, BindingResult bindingResult, Model model) {
    	User u2=userpo.validUseraccount(user.getAccount());
    	if (bindingResult.hasFieldErrors()) {
			model.addAttribute(user);
			return "register";
		}else if(u2!=null) {
			return "register_error"; 
		}
		else
			userpo.insert(user.getAccount(),user.getPassword(), user.getUser_name());
			return "login";
    }
}
