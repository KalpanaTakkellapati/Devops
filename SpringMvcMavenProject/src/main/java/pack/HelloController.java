package pack;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class HelloController {
  String message="welcome";
  @RequestMapping("/hello")
  public ModelAndView showMessage(@RequestParam(value="name",required=false,defaultValue="world")String name)
  {
	  System.out.println("in controller");
	  ModelAndView mv=new ModelAndView("helloworld");
	  mv.addObject
  }
  
}
