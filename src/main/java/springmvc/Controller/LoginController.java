package springmvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class LoginController {
	@RequestMapping("login")
	public String showForm() {
		return "login";
	}
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String handleform(
	@RequestParam ("email")String useremail,
	@RequestParam("username")String username,
	@RequestParam("password")String userpassword,Model model )
	{	
		System.out.println(useremail);
		System.out.println(username);
		System.out.println(userpassword);
		
		model.addAttribute("username",username);
		model.addAttribute("email",useremail);
		model.addAttribute("password",userpassword);
		
	return "sucsess";
	}

}
