package demojalaj;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class NameController {

	
	@RequestMapping("/name")
	public String name()
	{
		return "jalaj";
	}
}
