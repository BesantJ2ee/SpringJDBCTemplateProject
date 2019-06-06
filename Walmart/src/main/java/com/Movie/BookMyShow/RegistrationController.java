package com.Movie.BookMyShow;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Movie.modelObjects.ModelClasss;
import com.Movie.modelObjects.StudentUser;

@Controller
public class RegistrationController {
	
	@Autowired
	ServiceChecking serviceChecking;

	@RequestMapping("/UserRegistration")

	public ModelAndView registerEmail(@Valid @ModelAttribute("email1") StudentUser user, BindingResult res) {

		Boolean flag = false;
		
		flag = serviceChecking.getUserMobNumber(user.getMobNumber());

		if (flag.equals(false)) {

			ModelAndView model = new ModelAndView("Form");
			return model;
		}

		ModelAndView cbr = new ModelAndView("index");
		

		return cbr;
	}

	@RequestMapping("/Registration")

	public ModelAndView register(@Valid @ModelAttribute("customerVersion")ModelClasss student, BindingResult res) {

		// String a = request.getParameter("box1");
		// String b = request.getParameter("box2");
		// String c = request.getParameter("box3");
		// String d = request.getParameter("box4");

		// AddLogic cx = new AddLogic();
		// int status = cx.verification(a,b,c,d);
		
//		student.

		if (res.hasErrors()) {

			ModelAndView model = new ModelAndView("Form");
			return model;
		}

		ModelAndView cbr = new ModelAndView("Result");
		// cbr.setViewName("Result");
		// cbr.addObject("result",status);

		return cbr;
	}

}
