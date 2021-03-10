package com.mindtree.iplmgmt.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler {
	@Value("${spring.application.name}")
	private String applicationName;

@org.springframework.web.bind.annotation.ExceptionHandler
	public ModelAndView defaultErrorHandler(HttpServletRequest req,Exception e)
	{
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("ApplicationName", applicationName);
		modelAndView.addObject("Status",HttpStatus.NOT_FOUND.value());
		modelAndView.addObject("ErrorMessage", e.getMessage());
		modelAndView.addObject("url", req.getRequestURI());
		modelAndView.setViewName("error");

		
	return modelAndView;
	}
@ExceptionHandler
	public ModelAndView defaultErrorHandler(HttpServletRequest req,IPLException e)
	{
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("ApplicationName", applicationName);
		modelAndView.addObject("Status",HttpStatus.NOT_FOUND.value());
		modelAndView.addObject("ErrorMessage", e.getMessage());
		modelAndView.addObject("url", req.getRequestURI());
		modelAndView.setViewName("error");
	return modelAndView;
	}

}
