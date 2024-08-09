package dk.fsconsult.azure.hello_poc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {

	@RequestMapping("/")
	public @ResponseBody String greeting() {
		return "Hello My Github!";
	}
}
