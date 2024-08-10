package dk.fsconsult.azure.hello_poc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@RequestMapping("/")
	public String greeting() {
		return "Hello Azure World!";
	}
}
