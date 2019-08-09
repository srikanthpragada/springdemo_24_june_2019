package web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {
	@RequestMapping("/welcome")
	@ResponseBody
	public String welcome(@RequestParam(name="name", required=false) String name) {
		if (name == null)
			name = "Guest";
		return  "<h1>" + name + ", Welcome To Spring MVC</h1>";
	}

}
