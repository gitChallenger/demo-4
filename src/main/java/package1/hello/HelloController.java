package package1.hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String sayHi() {
		return "Hi";
	}
}
