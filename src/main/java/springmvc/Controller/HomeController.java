package springmvc.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {
		@RequestMapping("/dilu")
		public String home() {
				System.out.println("this home url");
			return "index";
		}
		@RequestMapping
		public String about() {
			System.out.println("about page");
			return "about";
		}
	}



