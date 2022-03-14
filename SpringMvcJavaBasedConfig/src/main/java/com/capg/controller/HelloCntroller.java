package com.capg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.capg.model.Student;

@Controller
public class HelloCntroller {

	 @RequestMapping("/greet")
	  public ModelAndView showView()
	  {
		 ModelAndView mv = new ModelAndView();
		  mv.setViewName("result");		 
		  Student stu = new Student();
		  stu.setStid(100);
		  stu.setStname("bindhu");	  
		  mv.addObject("res", stu);	  
		  return mv;
	  }
}