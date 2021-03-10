package com.mindtree.codingChallenge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mindtree.codingChallenge.entity.Class;
import com.mindtree.codingChallenge.entity.Student;
import com.mindtree.codingChallenge.exception.ServiceException;
import com.mindtree.codingChallenge.service.ClassService;

@Controller
public class ControllerClass {
@Autowired
ClassService classService;

	@RequestMapping("/")
	public String index1() {
		return "home";
	}

	@RequestMapping("/tohomeback")
	public String index2() {
		return "home";
	}

	@RequestMapping("/addclass")
	public String index11(Class class1) {
		if (class1.getClassSection() == null) {
			return "addclass";
		} else {
			classService.addClassToDatabase(class1);
			return "addclass";
		}

	}

	@RequestMapping("/addstudent")
	public String index13(Student student, Model model) throws ServiceException {
		model.addAttribute("ClassList", classService.getAllClass());

		if (student.getStudentName() == null) {

			return "addstudent";
		} else {
			classService.addStudentToDatabase(student);
			return "addstudent";
		}

	}
	
	
	@RequestMapping("/viewByClassSection")
	public String index2(Model model) {
		model.addAttribute("ClassList", classService.getAllClass());
		return "viewByClassSection";
	}
	
	@RequestMapping("/getStudentByClass")
	public String index3(@RequestParam("Classid") int classId,Model model) {
		
		model.addAttribute("studentList", classService.getAllStudentinClass(classId));
		model.addAttribute("ClassList", classService.getAllClass());
		return "viewByClassSection";
	}
	
}
