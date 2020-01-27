package pack;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
@Controller
@RequestMapping("/hello")
public class HelloController {
@RequestMapping(method=RequestMethod.GET)
public String printHello(ModelMap model)
{
	model.addAttribute("message", "hello hi how are you");
	return "hello";
}
}
