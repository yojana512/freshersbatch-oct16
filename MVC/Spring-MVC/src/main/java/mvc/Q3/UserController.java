package mvc.q3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	@RequestMapping(value="/login")
	public ModelAndView login() {
		ModelAndView mav= new ModelAndView("Q3/Login");
		return mav;
	}
	
	@RequestMapping(value="/submit", method=RequestMethod.POST)
	public ModelAndView verify(@ModelAttribute("user") User user) {
		
		ModelAndView mav;
		System.out.println(user);
		if(user.getUsername().compareTo("samee")==0 && user.getPassword().compareTo("asdfg")==0)
			mav= new ModelAndView("Q3/Success");
		else
			mav= new ModelAndView("Q3/Error");
		
		return mav;
	}
}