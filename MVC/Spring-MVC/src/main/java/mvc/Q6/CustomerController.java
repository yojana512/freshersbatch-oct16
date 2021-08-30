package mvc.q6;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {
	
	@RequestMapping(value="/customerRegister")
	public ModelAndView register() {
		return new ModelAndView("Q6/Registration");
	}
	
	@RequestMapping(value="/submitRegistration", method=RequestMethod.POST)
	public ModelAndView validate(@ModelAttribute("cus1") @Valid Customer cus, BindingResult result) {
		System.out.println(cus);
		if(result.hasErrors()) {
			ModelAndView mav=new ModelAndView("Q6/Registration");
			return mav;
		}
		else
			return new ModelAndView("Q6/Success");
	}
}