package com.cm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cm.pojo.Class;
import com.cm.pojo.Msg;
import com.cm.service.ClassService;

@Controller
public class ClassController {

	
	@Autowired
	ClassService classService;
	
	@ResponseBody
	@RequestMapping("/class")
	public Msg getClasses(){
		List<Class> classes = classService.getClasses();
		return Msg.success().add("classes", classes);
	}
}
