package web;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	@RequestMapping("/greet")
	public String greet(@RequestParam(name = "user") String user, ModelMap model) {
		model.put("user", user);
		model.put("now", LocalDateTime.now().toString());
		return "greet"; // greet.jsp
	}
}
